package exceptions;

public class Practice2Demo {
    public static void main(String[] args)  throws Exception {
        try {
            throw new Exception("new Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage()+" was caught!");
        } finally {
            System.out.println("I was there.");
        }
    }
}
