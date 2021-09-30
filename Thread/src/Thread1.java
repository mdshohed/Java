public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i<10000; i++) {
            System.out.print( 1 + " ");
            if ( i==10) {
                Thread.interrupted();
            }
        }
        System.out.println();
    }
}
