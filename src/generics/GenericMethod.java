package generics;

public class GenericMethod{
    public static <T extends Comparable<T>> int comparable (T x, T y){
        return x.compareTo(y);
    }
    public static <T extends Comparable<T>> boolean isEquel(T element1, T element2){
       return element1.compareTo(element2)==0;
    }
}
