package collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Object,String> backPack = new HashMap<>();
        Object object = new Object();

        backPack.put(new Object(),"pen2");
        backPack.put(object,"pen1");

        backPack.put(new Object(),"pen3");
        backPack.put(new Object(),"pen4");
        System.out.println(backPack.get(object));
        System.out.println(backPack);
        System.out.println(backPack.remove(object));
        System.out.println(backPack);

    }
}
