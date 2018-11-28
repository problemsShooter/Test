package regular;

public class Practice6 {
    public static void main(String[] args)  {
        System.out.println("Before 1122222345 after "+"1122222345".replaceAll("(\\d)\\1","\\*"));
        System.out.println("Before 121212 after "+"121212".replaceAll("(\\d)\\1","\\*"));
        System.out.println("Before 12 21212 after "+"12 21212".replaceAll("(\\d)\\1","\\*"));
        System.out.println("Before 22 111212 after "+"22 111212".replaceAll("(\\d)\\1","\\*"));
    }
}
