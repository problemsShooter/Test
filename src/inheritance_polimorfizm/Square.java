package inheritance_polimorfizm;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        width = length = side;
    }

    public Square(String colour, boolean filled, double side) {
        super(colour, filled, side, side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + width + ", which is a subclass of " + super.toString();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        super.setWidth(length);
    }
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
    @Override
    public void setWidth(double length) {
        this.length = length;
        super.setLength(length);
    }
}
