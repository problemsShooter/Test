package regular;

public class Practice6 {
    public static void main(String[] args) {
        System.out.println("1122222345".replaceAll("(\\d)\\1","\\*"));
        System.out.println("121212".replaceAll("(\\d)\\1","\\*"));
        System.out.println("12 21212".replaceAll("(\\d)\\1","\\*"));
        System.out.println("22 111212".replaceAll("(\\d)\\1","\\*"));
        System.out.println("22 111212".replaceAll("\\b(\\d)\\1\\b","\\*"));
    }
}
