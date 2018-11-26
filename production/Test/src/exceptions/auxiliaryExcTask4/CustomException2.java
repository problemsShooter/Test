package exceptions.auxiliaryExcTask4;

public class CustomException2 extends Throwable{
    private String text;

    public CustomException2(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
