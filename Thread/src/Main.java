import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         * @start Thread start
         *  @join until thread end
         * @isAlive the thread dead or not how to check
         * @interrupted Thread dead
         * @Priority
         */

        System.out.println("Thread start");
        float before = System.currentTimeMillis();
        /**
         * Another way thread call using Runnable
         */
        /*new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();*/

        Thread1 obj = new Thread1();
        Thread2 obj2 = new Thread2();

        /**
         * Thread One start
         */
        obj.start();
        System.out.println(obj2.isAlive());
        obj.join();
        System.out.println( "Thread one end");

        /**
         * Thread Two start
         */

        obj2.start();
        obj2.join();

        System.out.println("after call the thread");
        float after = System.currentTimeMillis();
        System.out.println( String.format("Time: %.2f",(float)(after-before)/1000));
    }
}
