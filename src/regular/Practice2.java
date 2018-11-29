package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {
    public static void main(String[] args) {
        String STR = "2013 1999 213 3444 5044 5192 5043 2020 532";
        Pattern p = Pattern.compile("\\b201[3-9]\\b|\\b20[2-9]\\d|\\b2[1-9]\\d{2}\\b|\\b[3-4]\\d{3}\\b|\\b504[0-3]\\b|\\b50[0-3]\\d\\b");
        Matcher m = p.matcher(STR);
        System.out.println("number between 2013 and 5043");
        System.out.println("2013 1999 213 3444 5044 5192 5043 2020 532");
        while(m.find()){
            System.out.println(m.group()+" - true;");
        }System.out.println();
    }
}
