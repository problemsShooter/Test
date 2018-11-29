package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice4 {
    public static void main(String[] args) {
        String[] masStr = {"2018/10/09", "12/10/2019", "92/10/2019",
                           "45/15/2019", "02/05/2015", "12/05/2015",
                           "12/30/2015", "12/32/2015", "13/30/2015",
                           "00/32/2015", "13/00/2015", "aa/02/9015"};
        Pattern p = Pattern.compile("0[1-9]/0[1-9]/[1-2]\\d\\d\\d|" +
                                    "0[1-9]/[1-2]\\d/[1-2]\\d\\d\\d|"+
                                    "0[1-9]/3[0-1]/[1-2]\\d\\d\\d|"+
                                    "1[0-2]/0[1-9]/[1-2]\\d\\d\\d|" +
                                    "1[0-2]/[1-2]\\d/[1-2]\\d\\d\\d|"+
                                    "1[0-2]/3[0-1]/[1-2]\\d\\d\\d");

        for (int i = 0; i < masStr.length; i++) {
            Matcher m = p.matcher(masStr[i]);
            while (m.find()) {
                System.out.print(m.group() + " ");
            }
            System.out.println();
        }
    }
}
