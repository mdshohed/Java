package Abstracts;
import Interfaces.*;

public class AbstractB extends AbstractA implements InterfaceA {
    public AbstractB(int x, int y) {
        super(y,x);
    }

    @Override
    public int add() {
        return getY()+getX();
    }

    @Override
    public int sub() {
        return getY()-getX();
    }

    @Override
    public int student() {
        return x+y;
    }
    @Override
    public int teacher() {
        return x;
    }
}
