package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<>();
            for(int i = 0; i<5; i++){
                queue.add(i*1.d);
            }
            out.println("Elements of queue "+queue);

        // To remove the head of queue.
        double remove = queue.remove();
        out.println("Removed element - " + remove);

        Double head = queue.peek();
        out.println("Head of queue - " + head);
        int size = queue.size();
        Collections.reverse((LinkedList)queue);
        out.println("Elements of queue "+queue);
        queue.forEach(System.out::println);
        out.println("Size of queue - " + size);
    }
}
