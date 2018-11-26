package exceptions.auxiliaryExcTask5;

public class Exception2 extends Exception1 {
    public Exception2(String text) {
        super(text);
    }

    @Override
    public void printInfo() {
        System.out.println("Exception2 " + text);
    }
}
