package java1.fundamental;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Practice4 {
    public static String str;
    public static char c;

    public Practice4() {
        str = "";
        c=' ';
    }

    public Practice4(String str) {
        this.str = str;

        Scanner scanner = new Scanner(System.in);
        String ch;
        do{
            System.out.print("Введите символ: ");
            ch = scanner.nextLine();
        }while (ch.length()!=1);
        c=ch.charAt(0);
    }

    public int countSymbols() {
        int count = 0;
        for(char i : str.toCharArray()){
            if(i==c)count++;
        }
        return count;
    }
}
