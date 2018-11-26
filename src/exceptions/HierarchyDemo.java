package exceptions;

import exceptions.auxiliaryExcTask5.BaseA;
import exceptions.auxiliaryExcTask5.BaseB;
import exceptions.auxiliaryExcTask5.BaseC;

public class HierarchyDemo {
    public static void main(String[] args) {
//        BaseA a = new BaseA();
//        a.method();
//        BaseB b = new BaseB();
//        b.method();
//        BaseC c = new BaseC();
//        c.method();
        BaseC c = new BaseC();

        ((BaseB)c).method();
        ((BaseA)c).method();

    }
}
