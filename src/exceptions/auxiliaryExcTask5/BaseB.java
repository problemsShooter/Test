package exceptions.auxiliaryExcTask5;

public class BaseB extends BaseA {
    @Override
    public void method() {
        try {
            throw new Exception2("exception2");
        } catch (Exception2 e) {
            System.out.print("we are in BaseB ");
            e.printInfo();
        }
    }
}
