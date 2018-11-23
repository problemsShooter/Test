package abstractClasses_intefaces;

import inheritance_polimorfizm.Circle1;
import inheritance_polimorfizm.Rectangle;

public class AbstarctShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 8);
        Circle1 circle = new Circle1(1);
        System.out.println("Point is inside of shape ? " + rectangle.isInside(3.1, 2));
        System.out.println("Point is inside of shape ? " + circle.isInside(0.5, 0.5));
        System.out.println("Perimeter of rectangle " + rectangle.getPerimeter());
        System.out.println("perimeter of circle " + circle.getPerimeter());
        System.out.println("Area of rectangle " + rectangle.getArea());
        System.out.println("Area of circle " + circle.getArea());
    }

}
