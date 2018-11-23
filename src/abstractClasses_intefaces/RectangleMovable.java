package abstractClasses_intefaces;

public class RectangleMovable implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    @Override
    public String toString() {
        return "MovableRectangle representation. topLeft(x1,y1)= (" + topLeft.getX() + ";" + topLeft.getY() +
                ") bottomRight(x2,y2) = (" + bottomRight.getX() + ";" + bottomRight.getY() + ").";
    }

    public RectangleMovable(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.getX() < bottomRight.getX() && topLeft.getY() > bottomRight.getY()) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        } else System.out.print("change topLeft or bottomRight");
    }

    public void moveUp() {
        if (topLeft.getY() + topLeft.getySpeed() > bottomRight.getY() + bottomRight.getySpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else System.out.println("You can't move up");
    }

    public void moveDown() {
        if (topLeft.getY() - topLeft.getySpeed() > bottomRight.getY() - bottomRight.getySpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        } else System.out.println("You can't move down");
    }

    public void moveLeft() {
        if (topLeft.getX() - topLeft.getxSpeed() < bottomRight.getX() - bottomRight.getxSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else System.out.println("You can't move Left");
    }

    public void moveRight() {
        if (topLeft.getX() + topLeft.getxSpeed() < bottomRight.getX() + bottomRight.getxSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        } else System.out.println("You can't move Right");
    }
}
