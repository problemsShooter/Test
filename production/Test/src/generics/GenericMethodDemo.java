package generics;

import inheritance_polimorfizm.Circle;
import inheritance_polimorfizm.Circle1;

public class GenericMethodDemo {
    public static <T> void printResultOfCompare(T num1, T num2) {
        String str;
        int result;
        if (num1 instanceof Integer) {
            str = "Integer ";
            result = GenericMethod.comparable((Integer) num1, (Integer) num2);
        } else if (num1 instanceof String) {
            str = "String ";
            result = GenericMethod.comparable((String) num1, (String) num2);
        } else if (num1 instanceof Character) {
            str = "Character ";
            result = GenericMethod.comparable((Character) num1, (Character) num2);
        } else if (num1 instanceof Double) {
            str = "Double ";
            result = GenericMethod.comparable((Double) num1, (Double) num2);
        }else if (num1 instanceof Float) {
            str = "Float ";
            result = GenericMethod.comparable((Float) num1, (Float) num2);
        } else {
            str = "Custom's type ";
            System.out.println(str + num1 +" "+ num2);
            return;
        }
            if (result < 0) System.out.println(str + num1 + " is lower than " + num2);
            else if (GenericMethod.isEquel(result, 0)) System.out.println(str + num1 + " is equel to " + num2);
            else System.out.println(str + num1 + " is bigger than " + num2);
    }

    public static void main(String[] args) {

        printResultOfCompare("int", "123");
        printResultOfCompare(-123, 12);
        printResultOfCompare('c', 'c');
        printResultOfCompare(new Circle(), new Circle());

    }
}
