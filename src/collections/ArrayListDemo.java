package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(1, "1,5");
        list.add(4, "3,5");
        list.remove(3);
        Collections.sort(list);
        Collections.reverse(list);
        for (String list1 : list) {
            System.out.println(list1);
        }


    }

}
