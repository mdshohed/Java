package SynchonizeThread;

public class T2 extends Thread {
    String threadName;
    PrintAny printAny;

    public T2(String  threadName, PrintAny printAny) {
        this.threadName = threadName;
        this.printAny = printAny;
    }

    @Override
    public void run() {
        //synchronized (printAny) {
            this.printAny.printCount();
            //System.out.println(threadName + " finished");
       // }

    }
}
