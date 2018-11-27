package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b201[3-9]\\b|\\b20[2-9]\\d|\\b2[1-9]\\d{2}\\b|\\b[3-4]\\d{3}\\b|\\b504[0-3]\\b|\\b50[0-3]\\d\\b");
        Matcher m = p.matcher("2013 1999 213 3444 5044 5192 5043");
        while(m.find()){
            System.out.print(m.group()+" ");
        }System.out.println();
    }
}
