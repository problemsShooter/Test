package inheritance_polimorfizm;

public class ShapeDemo {
    public static void main(String[] args) {
        //Shape shape = new Shape("Red", false);
        //System.out.println(shape.toString());

        Circle1 circle1 = new Circle1("Red", true, 1.3);
        System.out.println(circle1.toString());

        Shape[] shapes = { circle1, new Rectangle("Blue", true, 5.0f, 1.2f), new Square("yellow", false, 1.5)};

        for (Shape shape1 : shapes) {
            System.out.println(shape1.toString());
            if (shape1 instanceof Circle1) System.out.println("Area is " + ((Circle1) shape1).getArea());
            if (shape1 instanceof Rectangle) System.out.println("Perimeter is " + ((Rectangle) shape1).getPerimeter());
        }
    }
}
