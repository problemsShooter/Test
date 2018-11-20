package inheritance_polimorfizm;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    Shape() {
        colour = "green";
        filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isInside(double x, double y);
    @Override
    public String toString() {
        String string = "A Shape with the colour of " + colour + " and ";
        if (filled) return string + "filled";
        else return string + "Not filled";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
