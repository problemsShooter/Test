package exceptions;

public class ArrayBoundOfExceptionDemo {
    public static void main(String[] args) {
        int[] mas = new int[5];
        for(int i = 0; i <7; i++){
            try{
                mas[i]=i;
                System.out.print(mas[i]+" ");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("\n"+e);
            }
        }
    }

}
