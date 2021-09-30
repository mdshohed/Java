/**
 * @author mdshohed
 */

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        Shared s3 = new Shared();
        Thread1 thread1 = new Thread1(s1,s2,s3);
        Thread2 thread2 = new Thread2(s1,s2,s3);
        Thread3 thread3 = new Thread3(s1,s2,s3);

        /**
         * 3 different Thread call
         * 1: thread 1 -> test1: start, test2: start, test3: star,end, test2:end, test1: end
         * 2: thread 2 ->  test2: start, test3: star,end, test2:end
         * 3: thread 3 -> test3: start, end
         */

        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * Thread 1
     */
    static class Thread1 extends Thread{
        private Shared s1,s2, s3;
        public Thread1(Shared s1, Shared s2,Shared s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
        @Override
        public void run() {
            s1.test1(s2,s3);
        }
    }

    /**
     * Thread 2
     */
    static class Thread2 extends Thread {
        private Shared s1,s2, s3;
        public Thread2(Shared s1, Shared s2,Shared s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
        @Override
        public void run() {
            s2.test2(s3);
        }
    }

    /**
     * Thread 3
     */
    static class Thread3 extends Thread {
        private Shared s1,s2, s3;
        public Thread3(Shared s1, Shared s2,Shared s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
        @Override
        public void run() {
            s3.test3();
        }
    }

    /**
     * Shared structure
     */

    static void Util(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Shared {
        synchronized void test1(Shared s2,Shared s3)  {
            System.out.println( "Test1-begin");
            Util(1000);
            s2.test2(s3);
            System.out.println( "test1-end");
        }
        synchronized void test2(Shared s3)  {
            System.out.println( "Test2-begin");
            Util(1000);
            s3.test3();
            System.out.println( "test2-end");
        }
        synchronized void test3()  {
            System.out.println("Thread3-begin");
            Util(1000);
            System.out.println("Thread3-end");
        }
    }
}
