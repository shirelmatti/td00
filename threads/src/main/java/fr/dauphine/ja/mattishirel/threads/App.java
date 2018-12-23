package fr.dauphine.ja.mattishirel.threads;

/**
 * Hello world!
 *
 */
public class App {


        public static void main( String[] args) {
        try {
            double a=System.currentTimeMillis();
            System.out.println(MySafeList.stressTest(1,2));
            double b= System.currentTimeMillis();
            double c=b-a;
            System.out.println("Le temps pour le sans thread est "+ c);
            a=System.currentTimeMillis();
            System.out.println(MySafeList.testProduitScalaire(2));
            b=System.currentTimeMillis();
            c=b-a;
            System.out.println("Le temps pour le avec threads est "+c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
