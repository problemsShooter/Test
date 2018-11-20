package inheritance_polimorfizm;

public class Math {
    public Math() {
    }

    public double pow(int num1, int num2) {
        double number = 1.0D;
        int d = num2;
        if (num2 < 0) {
            d = -num2;
        }

        for(int i = 0; i < d; ++i) {
            number *= (double)num1;
        }

        return num2 >= 0 ? number : 1.0D / number;
    }

    public double pow(double num1, int num2) {
        double number = 1.0D;
        int d = num2;
        if (num2 < 0) {
            d = -num2;
        }

        for(int i = 0; i < d; ++i) {
            number *= num1;
        }

        return num2 >= 0 ? number : 1.0D / number;
    }

    public int nextAfter(int[] array, int num) {
        int[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int i = var3[var5];
            if (i > num) {
                return i;
            }
        }

        return 0;
    }

    public double nextAfter(double[] array, double num) {
        double[] var4 = array;
        int var5 = array.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            double i = var4[var6];
            if (i > num) {
                return i;
            }
        }

        return 0.0D;
    }

    public int min(int[] array) {
        int MIN_INT = 2147483647;
        int[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int i = var3[var5];
            if (i < MIN_INT) {
                MIN_INT = i;
            }
        }

        return MIN_INT;
    }

    public double max(double[] array) {
        double MAX_DOUBLE = -4.9E-324D;
        double[] var4 = array;
        int var5 = array.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            double i = var4[var6];
            if (i < MAX_DOUBLE) {
                MAX_DOUBLE = i;
            }
        }

        return MAX_DOUBLE;
    }

    public int max(int[] array) {
        int MAX_INT = -2147483648;
        int[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int i = var3[var5];
            if (i > MAX_INT) {
                MAX_INT = i;
            }
        }

        return MAX_INT;
    }

    public double min(double[] array) {
        double MIN_DOUBLE = 1.7E308D;
        double[] var4 = array;
        int var5 = array.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            double i = var4[var6];
            if (i < MIN_DOUBLE) {
                MIN_DOUBLE = i;
            }
        }

        return MIN_DOUBLE;
    }
}

