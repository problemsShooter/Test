package regular;

public class Practice3 {
    public static void main(String[] args) {
        String str = "  Removing        Extra Spaces       Between Words in  the             text  ";
        System.out.print(str.replaceAll("\\s+"," ").replaceAll(" (?<q>.*)","${q}").replaceAll("(?<q>.*) ","${q}"));System.out.print(". Checked");
    }
}
