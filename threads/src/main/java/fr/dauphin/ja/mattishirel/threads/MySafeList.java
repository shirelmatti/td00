package fr.dauphin.ja.mattishirel.threads;

import java.util.ArrayList;
import java.util.Random;

public class MySafeList {
    // en utilisant la deleguation c'est mieux car on est sure qu'on ne va aps appeler les methodes d'avant
    private ArrayList<Double> list;
    private final Object monitor = new Object() ;
    private final Object monitorLecture = new Object() ;
    private final Object monitorEcriture = new Object() ;

    public MySafeList(){
        list=new ArrayList<Double>();
    }

    public void add(Double i){

        System.out.println("ajout de "+i);
        synchronized (monitorLecture){
            synchronized ( monitorEcriture) {
                list.add(i);
            }
        }
    }

    public int size(){
        synchronized (monitorLecture) {
            return list.size();
        }

    }

    public double  get(int i){
            synchronized(monitorLecture) {

                return list.get(i);
            }

    }

    public static  double paralleleScalar(MySafeList v1, MySafeList v2,int n){

        ScalarThread[] threads=new ScalarThread[n];
        double somme=0;

        for(int i= 0; i<n;i++){
            ScalarThread scalarThread=new ScalarThread(v1,v2,i,i);
            scalarThread.start();
            threads[i]=scalarThread;
        }
        for(int i= 0; i<n;i++){
            try {
                threads[i].join();
                somme+=threads[i].getResult();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return somme;
    }

    public static boolean stressTest(int n, final int m) throws InterruptedException {
        final MySafeList mySafeList=new MySafeList();
        final Random random=new Random();
        Thread[] threads=new Thread[n];
        for(int i=0;i<n;i++){
            Thread th=new Thread(new Runnable() {
                public void run() {
                    for(int j=0;j<m;j++){
                        mySafeList.add(1.0);
                    }
                }
            });
            threads[i]=th;
            threads[i].start();

        }
        for(int i=0;i<n;i++){
            threads[i].join();
        }
        System.out.println(mySafeList.size());
        if(mySafeList.size()!=n*m){
            return false;
        }

        return true;

    }

    public static double scalar(MySafeList v1, MySafeList v2,int begin, int end){
        double somme=0;
        for(int i=begin;i<=end;i++){
            somme+=v1.get(i)*v2.get(i);
        }
        return somme;
    }

    public static double testProduitScalaire(int n){
        MySafeList mySafeList1=new MySafeList();
        MySafeList mySafeList2= new MySafeList();
        Random random= new Random();
        for(int i=0;i<n;i++) {
            mySafeList1.add(1.0);
            mySafeList2.add(1.0);
        }
        return paralleleScalar(mySafeList1,mySafeList2,mySafeList1.size());
    }




}
