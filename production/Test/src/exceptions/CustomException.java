package exceptions;

public class CustomException extends Exception{
    private StringBuilder text;

    public CustomException(StringBuilder text) {
        this.text = text;
    }
    public void print(){
        System.out.println("catch " + text);
    }
}
