package inheritance_polimorfizm;

public class Circle {
    protected double radius;
    protected Colour colour;

    public Circle() {
        radius = 0;
        colour = Colour.WHITE;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
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

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Color of circle is " + colour.getColour()+", radius " + radius;
    }

    enum Colour {
        RED("Red"),
        BLUE("Blue"),
        WHITE("White");
        private String colour;

        Colour(String string) {
            colour = string;
        }

        public String getColour() {
            return this.colour;
        }
    }
}
