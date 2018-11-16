package object_basics;

import static java.lang.System.*;

public class Clock implements Comparable<Clock> {


    private int hour;
    private int minutes;
    private int seconds;

    public Clock() {
        hour = 12;
        minutes = 0;
        seconds = 0;
    }

    public void addClock(Clock clock) {
        int sumSeconds;
        sumSeconds = clock.seconds + seconds + 60 * (clock.minutes + minutes) + 3600 * (clock.hour + hour);
        if (sumSeconds >= 0 && sumSeconds <= 86399) {
            this.setClock(sumSeconds);
        } else {
            this.setClock(sumSeconds - 86400);
        }

    }

    public void showTime() {
        out.println("Time is: " + this.getHour() + " hours " + this.getMinutes() + " minutes " + this.getSeconds() + " seconds\n");
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            minutes++;
            seconds = 0;
            if (minutes == 60) {
                hour++;
                minutes = 0;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }

    }

    public Clock(int hour, int minutes, int seconds) {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
        else {
            Exception e = new Exception("number of hours have to be between 0 and 23. Current is: " + hour + ".");
            out.println(e);
            return;
        }
        if (minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else {
            Exception e = new Exception("number of minutes have to be between 0 and 59. Current is: " + minutes + ".");
            out.println(e);
            return;
        }
        if (seconds >= 0 && seconds <= 59)
            this.seconds = seconds;
        else {
            Exception e = new Exception("number of seconds have to be between 0 and 59. Current is: " + seconds + ".");
            out.println(e);
        }
    }

    public Clock(int seconds) {
        this.setClock(seconds);
    }

    public String stringClock() {
        String str = "(";
        if (hour < 10) str += 0;
        str += hour + ":";
        if (minutes < 10) str += 0;
        str += minutes + ":";
        if (seconds < 10) str += 0;
        str += seconds + ")";
        return str;
    }

    public Clock subtractClock(Clock clock) {
        int sumSeconds1 = clock.seconds + 60 * clock.minutes + 3600 * clock.hour;
        int sumSeconds2 = seconds + 60 * minutes + 3600 * hour;
        return new Clock(Math.abs(sumSeconds1 - sumSeconds2));
    }

    @Override
    public int compareTo(Clock clock) {
        int sumSeconds1 = clock.seconds + 60 * clock.minutes + 3600 * clock.hour;
        int sumSeconds2 = seconds + 60 * minutes + 3600 * hour;
        if (sumSeconds1 == sumSeconds2) return 0;
        else if (sumSeconds1 < sumSeconds2) return -1;
        else return 1;
    }

    public void tickDown() {
        if (seconds == 0 && minutes == 0 && hour == 0) {
            Exception e = new Exception("Second can't be removed");
            out.println(e.getMessage());
            return;
        }
        if (seconds != 0) {
            seconds--;
        } else if (minutes != 0) {
            minutes--;
            seconds = 59;
        } else {
            hour--;
            minutes = 59;
            seconds = 59;
        }
    }

    public void setClock(int seconds) {
        if (seconds >= 0 && seconds < 86400) {
            hour = seconds / 3600;
            minutes = (seconds - hour * 3600) / 60;
            this.seconds = seconds - hour * 3600 - minutes * 60;
        } else {
            Exception e = new Exception("Value of seconds have to be between 0 and 86399. Change the value!");
            out.println(e.getMessage());
        }
    }


    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
