package object_basics;

import java.util.Scanner;

public class TurtleDemo {


    public static int getNumber(int numberMax) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        do {
            System.out.print("Input number between 0 and " + numberMax + " ");

            try {
                num = scanner.nextInt();
            } catch (Exception var4) {
                scanner.next();
                System.out.print("Change number!!! Input number between 0 and " + numberMax + " ");
            }
        } while (num < 0 || num > numberMax);

        return num;
    }

    public static String getFormat() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String[] massStr = new String[1];
        int countSteps = 0;
        System.out.print("Input direction: l-left; r-right; u-up; d-down and count of steps. Clear board - c ");
        while (true) {
            try {
                str = scanner.nextLine();
                massStr = str.split(" ");
                if (massStr.length == 1 && massStr[0].equals("c")) {
                    return massStr[0];
                }
                countSteps = Integer.parseInt(massStr[1]);
                if (massStr.length == 2 && (massStr[0].equals("u") || massStr[0].equals("l") || massStr[0].equals("r") || massStr[0].equals("d"))) {
                    return str;
                }
                System.out.print("Change format of string!!!");
            } catch (Exception var5) {
                System.out.print("Change format of string!!!");
            }
        }
    }

    public static void main(String[] args) {

        new Scanner(System.in);
        System.out.println("Input width of board");
        int width = getNumber(5);
        System.out.println("Input height of board");
        int height = getNumber(10);
        System.out.println("Input initial width pen's position ");
        int penPositionX = getNumber(width);
        System.out.println("Input initial height pen's position ");
        int penPositionY = getNumber(height);
        Turtle turtle = new Turtle(new char[width][height], new Position(penPositionX - 1, penPositionY - 1));
        turtle.showBoard();
        turtle.isMovePenRight();
        turtle.showBoard();

        turtle.movePen(getFormat());
        turtle.showBoard();
        turtle.movePen(Turtle.Direction.RIGHT, 2);
        turtle.showBoard();
    }
}
