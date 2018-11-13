package object.basics;
import java.util.Scanner;

public class ClockDemo {
    public static int getNumber(int maxValue){
        Scanner s = new Scanner(System.in);
        String str;
        int k;
        boolean bool = false;
        do {
            System.out.println("Input number between 0 and "+maxValue);
            str = s.nextLine();
            for (char a : str.toCharArray()) {
                if ((int)a <= 57 && (int)a >= 48) {
                } else {
                    System.out.println("Please change the line.");
                    bool = true;
                    break;
                }

            }

            if(Integer.parseInt(str)>maxValue)bool = true;
        } while (bool);
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {

        System.out.println("Input time in seconds:");
        Clock firstClock = new Clock(getNumber(86399));
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            firstClock.showTime();
        }
        System.out.println("Input time :");
        System.out.println("Input count of hours:");
        int hours = getNumber(23);
        System.out.println("Input count of minutes:");
        int minutes = getNumber(59);
        System.out.println("Input count of seconds:");
        int seconds = getNumber(59);
        Clock secondClock = new Clock(hours, minutes, seconds);
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            secondClock.showTime();
        }
        firstClock.addClock(secondClock);
        firstClock.showTime();
        secondClock.showTime();

        Clock thirdClock = firstClock.subtractClock(secondClock);
        thirdClock.showTime();

    }
}
