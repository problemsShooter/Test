package object_basics;

import java.util.Scanner;

public class DogsDemo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0, MAX_COUNT_DOGS = 1000, MAX_AGE = 20;
        System.out.print("Input count of dogs: ");
        Dogs[] dogs = new Dogs[ClockDemo.getNumber(MAX_COUNT_DOGS)];

        while (i < dogs.length) {
            System.out.print("Input data dogs? if \"yes\" enter yes: ");
            String string1 = scanner.next();
            System.out.println();
            if (string1.equals("yes")) {
                i++;
                System.out.print("How many parameters?");
                int num = ClockDemo.getNumber(3);
                switch (num) {
                    case 0:
                        dogs[i] = new Dogs();
                        dogs[i].showParam();
                        break;
                    case 1:
                        System.out.println("Choose parameter: name - 0; size - 1; age - 2;");
                        int num1 = ClockDemo.getNumber(2);
                        switch (num1) {
                            case 0:
                                System.out.print("Input name ");
                                dogs[i] = new Dogs(scanner.next());
                                dogs[i].showParam();
                                break;
                            case 1:
                                System.out.print("Input size is: big - 0; medium - 1; small - 2. ");
                                dogs[i] = new Dogs(Dogs.Size.size(ClockDemo.getNumber(2)));
                                dogs[i].showParam();
                                break;
                            case 2:
                                System.out.print("Input age ");

                                dogs[i] = new Dogs(ClockDemo.getNumber(MAX_AGE));
                                dogs[i].showParam();
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Input name-age - 0; name-size - 1; age-size - 2;");
                        int num2 = ClockDemo.getNumber(2);
                        switch (num2) {
                            case 0:
                                System.out.print("Input name ");
                                String st = scanner.next();
                                System.out.println("Input age ");
                                dogs[i] = new Dogs(st, ClockDemo.getNumber(MAX_AGE));
                                break;
                                case 1:
                                System.out.print("Input name ");
                                    String st1 = scanner.next();
                                    System.out.print("Input size is: big - 0; medium - 1; small - 2. ");
                                dogs[i] = new Dogs(st1, ClockDemo.getNumber(2));
                                break;
                                case 2:
                                    System.out.print("Input size is: big - 0; medium - 1; small - 2. ");
                                    int in = ClockDemo.getNumber(2);
                                    System.out.println("Input age ");
                                dogs[i] = new Dogs(Dogs.Size.size(in), ClockDemo.getNumber(MAX_AGE));
                                break;
                        }
                        dogs[i].showParam();
                        break;
                    case 3:
                        System.out.print("Input name ");
                        String st = scanner.next();
                        System.out.print("Input size is: big - 0; medium - 1; small - 2. ");
                        int qwe = ClockDemo.getNumber(2);
                        System.out.print("Input name-age - 0; name-size - 1; age-size - 2;");
                        System.out.println("Input age ");
                        dogs[i] = new Dogs(st, Dogs.Size.size(qwe), ClockDemo.getNumber(MAX_AGE));
                        dogs[i].showParam();
                        break;
                }
            } else {
                for (; i < dogs.length; i++) {
                    dogs[i] = new Dogs();
                    dogs[i].showParam();
                }
            }

        }
        System.out.println("\nInput type of sort: AGE-0; NAME-1; SIZE-2.");
        Dogs.sortDogs(dogs, ClockDemo.getNumber(2));
        for (i = 0; i < dogs.length; i++) {
            dogs[i].showParam();
        }
    }
}
