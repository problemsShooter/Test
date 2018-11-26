package exceptions.auxiliaryExcTask4;

public class CustomException3 extends ArrayIndexOutOfBoundsException {
    private String text;

    public CustomException3(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
