package exceptions;

public class ArrayBoundOfExceptionDemo {
    public static void main(String[] args) {
        int[] massiv = new int[5];
        for(int i = 0; i <7; i++){
            try{
                massiv[i]=i;
                System.out.print(massiv[i]+" ");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("\n"+e);
            }
        }
    }

}
