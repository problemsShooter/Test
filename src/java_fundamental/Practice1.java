package java_fundamental;

public class Practice1 {


    public static int minIntFrom2(int a, int b) {
        return a < b ? a : b;
    }

    public static int minIntFrom3(int a, int b, int c) {
        int min1 = minIntFrom2(a, b);
        return minIntFrom2(min1, c);
    }
}
