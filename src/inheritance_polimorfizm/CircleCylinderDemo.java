package inheritance_polimorfizm;

public class CircleCylinderDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(12.0, Circle.Colour.BLUE);
        System.out.println(circle.toString());
        System.out.printf("Area of circle is %.2f\n\n",circle.getArea());

        Cylinder cylinder = new Cylinder(1, Circle.Colour.RED,3);
        System.out.println(cylinder.toString());
        System.out.printf("Area of cylinder is %.2f\n", cylinder.getArea());
        System.out.printf("Volume of cylinder is %.2f\n", cylinder.getVolume());
    }
}
