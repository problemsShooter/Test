package exceptions.auxiliaryExcTask5;

public class Exception1 extends Exception {
    protected String text;

    public Exception1(String text) {
        this.text = text;
    }

    public void printInfo() {
        System.out.println("Exception1 " + text);
    }
}
