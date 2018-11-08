package java1.fundamental;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Practice2 {
    private static int sizeMass;
    private static int num;
    private static int [] mass;


    public Practice2() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива: ");
        sizeMass = in.nextInt();
        System.out.println("Введите число для поиска: ");
        num = in.nextInt();
        mass = new int[sizeMass];
        for(int i = 0; i<sizeMass; i++)mass[i] = random.nextInt(100);

    }
    public void showMass(){
        for(int i = 0; i<sizeMass; i++)System.out.print(mass[i]+" ");
        System.out.println();
    }
    public void searchOneByOne(){
        long startTime = System.nanoTime();

        boolean bool= false;
        for(int i = 0; i<sizeMass; i++){
            if(mass[i]==num){
                bool=true;
                break;
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Cодержит ли массив число(способ OneByOne): "+(bool?"true;":"false;")+" time is "+totalTime);
    }
    public void searchBinary(){
        long startTime = System.nanoTime();
        Arrays.sort(mass);
        int i = -1;
        if (this.mass != null) {
            int low = 0, high = this.mass.length, mid;
            while (low < high) {
                mid = (low + high)/2; // Можно заменить на: (low + high) >>> 1, чтоб не возникло переполнение целого
                if (num == this.mass[mid]) {
                    i = mid;
                    break;
                } else {
                    if (num <= this.mass[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Cодержит ли массив число(способ binary): "+((i==-1)?"false;":"true;")+" time is "+totalTime);
    }
}
