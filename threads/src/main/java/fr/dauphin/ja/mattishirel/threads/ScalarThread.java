package fr.dauphin.ja.mattishirel.threads;

public class ScalarThread extends Thread  {
    private MySafeList v1;
    private MySafeList v2;
    private int begin;
    private int end;
    private double resultat;

    public ScalarThread(MySafeList v1, MySafeList v2, int begin, int end){
        this.v1=v1;
        this.v2=v2;
        this.begin=begin;
        this.end=end;
    }

    public double getResult(){
        return resultat;
    }


    public void run() {
        this.resultat= MySafeList.scalar(v1,v2,begin,end);
    }
}

