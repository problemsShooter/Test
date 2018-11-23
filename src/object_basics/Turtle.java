package object_basics;

//import Turtle.1;

public class Turtle {
    private char[][] board;
    private Position position;
    private char cellChar;
    private char coloredCellChar;
    private char penChar;

    public Turtle() {
        this.position = new Position();
        this.cellChar = '.';
        this.coloredCellChar = 'o';
        this.penChar = 'x';
        this.board = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.board[i][j] = this.cellChar;
            }
        }

        this.board[this.position.getX()][this.position.getY()] = this.penChar;
    }

    public Turtle(char[][] board, Position position, char cellChar, char coloredCellChar, char penChar) {
        this.cellChar = cellChar;
        this.coloredCellChar = coloredCellChar;
        this.penChar = penChar;
        this.board = new char[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = cellChar;
            }
        }

        this.position = new Position(position.getX(), position.getY());
        board[position.getX()][position.getY()] = penChar;
    }

    public Turtle(char[][] board, Position position) {
        cellChar = '.';
        coloredCellChar = 'o';
        penChar = 'x';
        this.board = new char[board.length][board[0].length];

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = cellChar;
            }
        }

        this.position = new Position(position.getX(), position.getY());
        board[position.getX()][position.getY()] = this.penChar;
    }

    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (position.getX() == i && position.getY() == j) {
                    System.out.print(penChar + " ");
                } else if (board[i][j] == coloredCellChar) {
                    System.out.print(coloredCellChar + " ");
                } else if (board[i][j] == cellChar) {
                    System.out.print(cellChar + " ");
                }
            }

            System.out.println();
        }

    }

    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = cellChar;
            }
        }

        this.position = new Position();
    }

    public void movePen(Direction dir, int length) {
        switch (dir) {
            case UP:
                while (isMovePenUp() && length > 1) {
                    length--;
                }

                return;
            case DOWN:
                while (isMovePenDown() && length > 1) {
                    length--;
                }

                return;
            case RIGHT:
                while (isMovePenRight() && length > 1) {
                    length--;
                }

                return;
            case LEFT:
                while (isMovePenLeft() && length > 1) {
                    length--;
                }
        }

    }

    public void movePen(String string) {
        String[] mass = string.split(" ");
        switch (mass[0]) {
            case "c":
                clearBoard();
                break;
            default:
                movePen(Direction.getDirection(mass[0]),Integer.parseInt(mass[1]));
        }
    }

    public boolean isMovePenRight() {
        try {
            board[position.getX()][position.getY() + 1] = 'x';
            board[position.getX()][position.getY()] = coloredCellChar;
            position.setY(position.getY() + 1);
            return true;
        } catch (Exception var2) {
            System.out.println("You can't move right");
            return false;
        }
    }

    public boolean isMovePenLeft() {
        try {
            board[position.getX()][position.getY() - 1] = 'x';
            board[position.getX()][position.getY()] = coloredCellChar;
            position.setY(position.getY() - 1);
            return true;
        } catch (Exception var2) {
            System.out.println("You can't move left");
            return false;
        }
    }

    public boolean isMovePenDown() {
        try {
            board[position.getX() + 1][position.getY()] = 'x';
            board[position.getX()][position.getY()] = coloredCellChar;
            position.setX(position.getX() + 1);
            return true;
        } catch (Exception var2) {
            System.out.println("You can't move down");
            return false;
        }
    }

    public boolean isMovePenUp() {
        try {
            board[position.getX() - 1][position.getY()] = 'x';
            board[position.getX()][position.getY()] = coloredCellChar;
            position.setX(position.getX() - 1);
            return true;
        } catch (Exception var2) {
            System.out.println("You can't move up");
            return false;
        }
    }

   static enum Direction {
        UP("Up"),
        DOWN("Down"),
        LEFT("Lef"),
        RIGHT("Right");
        private String string;

        Direction(String string) {
            this.string = string;
        }

        public String getString() {
            return string;
        }

        public static Direction getDirection(String str) {
            switch (str) {
                case "u":
                    return UP;
                case "l":
                    return LEFT;
                case "r":
                    return RIGHT;
                case "d":
                    return DOWN;
            }
            return UP;
        }
    }

}
