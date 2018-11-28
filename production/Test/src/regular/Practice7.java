package regular;

public class Practice7 {
    public static void main(String[] args) {
        String STR = "password wword word Heeeeeeello";
        System.out.println(STR.replaceAll("\\b\\w*(\\w)\\1\\w*\\b","").replaceAll("\\s",""));
    }
}
