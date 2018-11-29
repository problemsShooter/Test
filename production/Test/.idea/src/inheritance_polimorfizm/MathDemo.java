package inheritance_polimorfizm;

public class MathDemo {
    public MathDemo() {
    }

    public static void main(String[] args) {
        Math math = new Math();
        int[] l = new int[]{1, 2, -2, 3};
        double[] l2 = new double[]{1.0D, 2.0D, -2.0D, -3.1D};
        System.out.println("Example of work min(int[] array) " + math.min(l));
        System.out.println("Example of work min(double[] array) " + math.min(l2));
        System.out.println("Example of work nextAfter(int[] array, int) " + math.nextAfter(l, 5));
        System.out.println("Example of work nextAfter(double[] array, double) " + math.nextAfter(l2, 1.4D));
        System.out.println("Example of work max(int[] array) " + math.max(l));
        System.out.println("Example of work max(double[] array) " + math.max(l2));
        System.out.println("Example of work pow(int, int) " + math.pow(-2, -3));
        System.out.println("Example of work pow(double, int) " + math.pow(2.2D, -2));
    }
}
