package collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Object, String> backPack = new HashMap<>();
        Object object = new Object();
        Object object1 = new Object();
        //added some elements to hashMap
        backPack.put(new Object(), "pen2");
        backPack.put(object, "pen1");
        backPack.put(object1, "pen3");
        //replace elements for key
        backPack.replace(object1, "notPen");
        backPack.put(new Object(), "pen4");
        //element with key-object has benn printed
        System.out.println("full HasMap " + backPack.get(object));
        System.out.println(backPack);
        System.out.println("was removed one element - "+backPack.remove(object));
        System.out.println(backPack);

    }
}
