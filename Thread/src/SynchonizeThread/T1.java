package SynchonizeThread;

public class T1 extends Thread{
    String threadName;
    PrintAny printAny;
    public T1(String  threadName, PrintAny printAny) {
        this.threadName = threadName;
        this.printAny = printAny;
    }
    @Override
    public void run() {
       // synchronized (printAny) {
            this.printAny.printCount();
           // System.out.println(threadName + " finished");
        //}
    }
}
