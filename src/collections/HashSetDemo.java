package collections;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Orange");
        hset.add("Grapes");
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Fig");
        //duplicate elements
        hset.add("Mango");
        hset.add("Fig");
        hset.add(null);
        hset.add(null);
        hset.add(null);

        System.out.println(hset);

        hset.remove("Grapes");
        //-------It doesn't work like in collections -------
        // Collections.sort(hset);
        hset.clear();
        hset.add("dog");
        //we can't add elements in specialise place
        //hset.add(0,"cat");
        for(String a: hset){
            System.out.println(a);
        }
    }
}
