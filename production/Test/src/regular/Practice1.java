package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {

    public static void main(String[] args) {
        final String DATA = "Word cAT DATA A site Java tExt";
        StringBuilder str = new StringBuilder(DATA);
        System.out.println(str);
        Pattern p = Pattern.compile("\\b[A-Z]\\w*\\b");
        Matcher m = p.matcher(DATA);
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

    }
}
