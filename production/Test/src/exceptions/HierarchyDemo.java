package exceptions;

import exceptions.auxiliaryExcTask5.BaseA;
import exceptions.auxiliaryExcTask5.BaseB;
import exceptions.auxiliaryExcTask5.BaseC;

public class HierarchyDemo {
    public static void main(String[] args) {
        BaseC c = new BaseC();
        c.method();
        ((BaseA)c).method();
        ((BaseA)c).method();

    }
}
