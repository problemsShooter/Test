package abstractClasses_intefaces;

public class RectangleMovableDemo {
    public static void main(String[] args) {

        MovablePoint topLeft = new MovablePoint(0,7,2,2);
        MovablePoint bottomRight = new MovablePoint(5,5,1,1);
        RectangleMovable rectangleMovable = new RectangleMovable(topLeft, bottomRight);
        System.out.println(rectangleMovable);
        rectangleMovable.moveUp();
        System.out.println("moveUp "+rectangleMovable);
        rectangleMovable.moveDown();
        System.out.println("moveDown "+rectangleMovable);
        rectangleMovable.moveDown();
        System.out.println("moveDown "+rectangleMovable);
        rectangleMovable.moveDown();
        System.out.println("moveDown "+rectangleMovable);
        rectangleMovable.moveLeft();
        System.out.println("moveLeft "+rectangleMovable);
        rectangleMovable.moveRight();
        System.out.println("moveRight "+rectangleMovable);
        System.out.println(topLeft);
        System.out.println(bottomRight);
    }

}
