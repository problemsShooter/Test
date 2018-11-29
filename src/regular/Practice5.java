package regular;

public class Practice5 {
    public static void main(String[] args) {
        String STR = "Regular regular popular expressions entered popular use from 1968 1968 1968";
        //String STR1 = "1968 1968 1968";
        System.out.println(STR.replaceAll("(\\d+)\\w*\\s+\\1", "").toLowerCase().replaceAll("(?<q>\\w+\\s)\\1", "${q}").replaceAll("\\s+", " "));

    }
}
