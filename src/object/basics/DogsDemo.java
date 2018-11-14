package object.basics;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {






        Scanner scanner = new Scanner(System.in);

        int k=0;
        boolean bool = true;
        while (bool) {
            System.out.print("Input count of dogs: ");
            String str = scanner.nextLine();
            try {
                k = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("Change value of number!!!");
            }

        }
        int i = 0;
        Dogs[] dogs = new Dogs[k];


        while (i < dogs.length) {
            System.out.print("Input data dogs? if \"yes\" enter yes: ");
            String string1 = scanner.nextLine();

            if (string1.equals("yes")) {
                while (true) {
                    System.out.print("Input dog's Name Size Age");
                    System.out.print("size is: BIG-0; MEDIUM-1; SMALL-2. ");
                    String string = scanner.nextLine();
                    String[] mass = string.split(" ",3);

                    try {
                        if(mass.length==3)
                        dogs[i] = new Dogs(mass[0], Size.size(mass[1]), Integer.parseInt(mass[2]));
                        else if(mass.length==2)
                        dogs[i] = new Dogs(mass[0], Size.size(mass[1]), Integer.parseInt(mass[2]));
                        dogs[i].showParam();
                        i++;
                       break;
                    } catch (Exception e) {
                        scanner.next();
                        System.out.print("Change data\n");
                    }
                }
            } else {
                for (; i < dogs.length; i++) {
                    dogs[i] = new Dogs();
                    dogs[i].showParam();
                }
            }

        }


//        }
    }
}
