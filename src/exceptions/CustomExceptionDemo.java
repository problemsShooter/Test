package exceptions;

public class CustomExceptionDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("customException");
        CustomException exception = new CustomException(sb);
        try{throw exception;}
        catch (CustomException e){
            exception.print();
        }
    }
}
