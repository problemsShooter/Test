package inheritance_polimorfizm;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, Colour colour) {
        super(radius, colour);
    }

    public Cylinder(double radius, Colour colour, double height) {
        super(radius, colour);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Color of cylinder is " + colour.getColour()+", radius " + radius + ", height " + height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
