package Abstracts;

public abstract class AbstractA {
    public int x;
    public int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public AbstractA(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract int add();
    public abstract int sub();
}
