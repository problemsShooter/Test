package regular;

public class Practice5 {
    public static void main(String[] args) {
        //it doesn't work
        String STR = "Regular regular popular expressions entered popular use from 1968 1968 1968";
        System.out.println(STR.replaceAll("\\b(\\w+)\\1\\b","$1"));

    }
}
