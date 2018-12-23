package fr.dauphin.ja.mattishirel.threads;

import sun.jvm.hotspot.runtime.Threads;

public class ThreadTest  {
    private  int n=0;
    //objet qui a la capacite d'etre executer
    private final Object monitor = new Object() ;

    public  Runnable threadTest(final int i){

        return  new Runnable() {
            public void run() {
                int j=1;
                synchronized (monitor) {
                while (j<=10000){
                        System.out.println("je suis le thread " + i + "et j'effectue l'iteration " + j);
                        j++;
                    }

                }
            }
        };
    }

    public static void main(String[] args){
        /*Runnable thread=ThreadTest.threadTest(3);
        thread.run();*/
        ThreadTest thread=new ThreadTest();
        Thread thread1=new Thread(thread.threadTest(1));
        Thread thread2=new Thread(thread.threadTest(2));
        thread1.start();
        thread2.start();
    }
}
