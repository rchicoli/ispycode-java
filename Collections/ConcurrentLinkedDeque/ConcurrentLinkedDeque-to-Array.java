import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Example {

    public static void main(String[] args) {

        // create ConcurrentLinkedDeque
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

        // add elements 
        deque.add(10);       
        deque.add(20);     
        deque.add(30);

        // print out deque
        System.out.println(deque);

        // create an array from the ConcurrentLinkedDeque
        Integer[] array = deque.toArray(new Integer[deque.size()]);

        // print out array
        System.out.println(Arrays.toString(array));

    }
}


