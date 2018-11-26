package exceptions.auxiliaryExcTask5;

public class Exception3 extends Exception2 {
    public Exception3(String text) {
        super(text);
    }

    @Override
    public void printInfo() {
        System.out.println("Exception3 " + text);
    }
}
