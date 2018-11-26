package exceptions.auxiliaryExcTask5;

public class BaseB extends BaseA {
    @Override
    public void method() {
//        super.method();
        try {
            throw new Exception2("exception2");
        } catch (Exception2 e) {
            e.printInfo();
        }
    }
}
