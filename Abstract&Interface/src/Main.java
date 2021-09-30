
public class Main {
    public static void main(String[] args) {
        D a = new D(34,23);
        System.out.println( "Called from abstract class A: "+a.sum() + " "+a.multiply()) ;
        System.out.println( "Called from interface C: "+a.student()+" "+a.teacher());
    }

    /**
     * @abstract class A
     */
    static abstract class A  {
        int x,y;
        public A(int x,int y) {
            this.x = x;
            this.y = y;
        }
        public abstract int sum();
        public abstract int multiply();
    }

    /**
     * @interface
     */
    interface B{
        int student();
        int teacher();
    }
    interface C{
        int programmer();
        int developer();
    }

    /**
     * @abstract class B called 1 abstract at a time and C,D two interface called
     */
    static class D extends A implements B,C{
        int x, y;
        public D(int x, int y) {
            super(x, y);
            this.x = x;
            this.y = y;
        }
        @Override
        public int sum() {
            return x+y;
        }
        @Override
        public int multiply() {
            return x-y;
        }

        @Override
        public int student() {
            return x;
        }

        @Override
        public int teacher() {
            return y;
        }

        @Override
        public int programmer() {
            return 0;
        }

        @Override
        public int developer() {
            return 0;
        }
    }
}



