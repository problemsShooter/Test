package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice4 {
    public static void main(String[] args) {
        String[] masStr = {"2018/10/09", "12/10/2019", "92/10/2019", "45/15/2019"/*, "aa\0\9"*/};
        Pattern p = Pattern.compile("\\d[0-2][/]\\d[0-2][/][1-2]\\d\\d\\d");//it doesn't work;

        for (int i = 0; i < masStr.length; i++) {
            Matcher m = p.matcher(masStr[i]);
            while (m.find()) {
                System.out.print(m.group() + " ");
            }
            System.out.println();
        }
    }
}
