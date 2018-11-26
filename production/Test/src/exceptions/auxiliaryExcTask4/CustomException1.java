package exceptions.auxiliaryExcTask4;

public class CustomException1 extends Exception{
    private String text;

    public CustomException1(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
