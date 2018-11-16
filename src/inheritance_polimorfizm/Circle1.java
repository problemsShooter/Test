package inheritance_polimorfizm;

public class Circle1 extends Shape {
    private double radius;

    public Circle1() {
        super();
        radius = 1.f;
    }

    public Circle1(double radius) {
        super();
        this.radius = radius;
    }

    public Circle1(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + radius + ", which is a subclass of "+super.toString();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
