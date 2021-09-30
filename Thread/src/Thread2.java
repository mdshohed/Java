public class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i<10000; i++) {
            if ( i%2==0) System.out.print( 2 +" " );
        }
        System.out.println();
    }
}
