package java1.fundamental;

import java.util.Scanner;
import java.util.Random;

public class Practice3 {
    private static int b[];
    private static int sizeMas;

    public Practice3() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число элементов массива: ");
        sizeMas = scanner.nextInt();
        b = new int[sizeMas];
        for (int i = 0; i < sizeMas; i++) {
            b[i] = random.nextInt(sizeMas);
        }
    }

    public void showMass() {
        for (int a : b) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void mixMass() {
        Random random = new Random();
        int k = random.nextInt(2 * sizeMas);
        while (k > 0) {
            int l = random.nextInt(sizeMas);
            int s = (l + random.nextInt(sizeMas)) % sizeMas;
            int m = b[l];
            b[l] = b[s];
            b[s] = m;
            k--;
        }
        System.out.println("Массив перемешан: ");
    }

    public void bubbleSort() {
        for (int i = 1; i < b.length; i++) {
            boolean var = true;
            for (int j = 0; j < b.length - i; j++) {
                if (b[j] > b[j + 1]) {
                    int a = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = a;
                    var = false;
                }
            }
            if (var) {
                System.out.println("Массив отсортирован Bubble сортировкой: ");
                return;
            }
        }
        System.out.println("Массив отсортирован Bubble сортировкой: ");
    }

    public void selectionSort() {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < b.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < b.length; j++)
                if (b[j] < b[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = b[min_idx];
            b[min_idx] = b[i];
            b[i] = temp;
        }
        System.out.println("Массив отсортирован selection sort: ");
    }
}
