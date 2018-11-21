package generics;

import inheritance_polimorfizm.Rectangle;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Rectangle> pair = new Pair<>("System Rectangle", new Rectangle(2, 4));
        String name = pair.getFirst();
        Rectangle rectangle = pair.getSecond();
        System.out.println(name);
        //System.out.println(Pair.comparable('c', 'a')); //if x<y return negative number
        System.out.println(rectangle);
    }

}
