package SynchonizeThread;

public class Main {
    public static void main(String[] args) {

        PrintAny printAny = new PrintAny();
        T1 obj1 = new T1("Thread 1: ",printAny);
        T2 obj2 = new T2( "Thread 2: ",printAny);

        obj1.start();
        obj2.start();
    }
}
