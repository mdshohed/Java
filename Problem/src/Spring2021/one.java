package Spring2021;

public class one {
    public static void main(String[] args) {
        int divide = 1000000/10;
        float before = System.currentTimeMillis();
        Prime prime = new Prime();

        MyThread[] myThread = new MyThread[10];
        int l = 2;
        int r = divide;

        for ( int i = 0; i<10; i++) {
            myThread[i] = new MyThread(l, r, prime);
            l = r+1;
            r = r + divide;
        }

        for(int i = 0; i<10; i++) {
            myThread[i].start();
            try {
                myThread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        float after = System.currentTimeMillis();
        System.out.println( String.format("Time: %.5f",(float)(after-before)/10000));
    }
}
class Prime {
    public boolean isPrime(int n) {
        if (n<2) return false;
        for(int i = 2; i<n; i++) {
            if ( n%i==0) return false;
        }
        return true;
    }
}

class MyThread extends Thread {
    int l, r;
    Prime prime;
    public MyThread(int l, int r, Prime prime) {
        this.l = l;
        this.r = r;
        this.prime = prime;
    }

    @Override
    public void run() {
        synchronized (prime) {
            for (int i = l; i <= r; i++) {
                if (prime.isPrime(i)) {
                    // System.out.println( i + " Prime");
                } else {
                    //System.out.println(i + " Not Prime");
                }
            }
        }
    }
}