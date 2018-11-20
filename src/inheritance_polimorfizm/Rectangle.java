package inheritance_polimorfizm;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        width = length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public boolean isInside(double x, double y){
        if(java.lang.Math.abs(x)<=width/2 && java.lang.Math.abs(y)<=length/2)return true;
        return false;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
