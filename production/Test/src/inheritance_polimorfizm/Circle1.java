package inheritance_polimorfizm;

public  class Circle1 extends Shape {
    private double radius;

    public Circle1() {
        super();
        radius = 1.f;
    }
    @Override
    public double getPerimeter(){
        return 2*java.lang.Math.PI*radius;
    }
    @Override
    public boolean isInside(double x, double y){
        return java.lang.Math.pow(x*x+y*y,0.5)<radius;
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
    @Override
    public double getArea() {
        return java.lang.Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
