package object_basics;
import java.util.Scanner;

public class ClockDemo {
    public static int getNumber(int maxValue){
        Scanner s = new Scanner(System.in);
        String str;
        int k = 0;

        do {
            System.out.print("Set the value for time between 0 and " + maxValue+" ");
            str = s.nextLine();
            try {
                k=Integer.parseInt(str);
               if(k<=maxValue && k>=0) return k;
               else System.out.print("Change value of number!!!");
            } catch (Exception e) {
                System.out.print("Change value of number!!!");
            }
        }while (k>=maxValue || k<=0);

        return k;
    }
    public static void main(String[] args) {
             final int MAX_HOURS = 23;
             final int MAX_MIN_SEC = 59;
             final int COUNT_SECONDS_IN_DAY = 86399;
        System.out.println("Input time in seconds:");
        Clock firstClock = new Clock(getNumber(COUNT_SECONDS_IN_DAY));
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            firstClock.showTime();
        }
        System.out.println("Input time :");
        System.out.println("Input count of hours:");
        int hours = getNumber(MAX_HOURS);
        System.out.println("Input count of minutes:");
        int minutes = getNumber(MAX_MIN_SEC);
        System.out.println("Input count of seconds:");
        int seconds = getNumber(MAX_MIN_SEC);
        Clock secondClock = new Clock(hours, minutes, seconds);
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            secondClock.showTime();
        }
        firstClock.addClock(secondClock);
        firstClock.showTime();
        secondClock.showTime();
        System.out.println(secondClock.stringClock());
        Clock thirdClock = firstClock.subtractClock(secondClock);
        thirdClock.showTime();
    }
}
