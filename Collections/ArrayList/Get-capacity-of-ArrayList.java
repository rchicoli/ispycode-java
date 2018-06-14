import java.lang.reflect.Field;
import java.util.ArrayList;

public class Example {

    public static void main(String[] args) throws Exception {


        // create ArrayList.
        ArrayList<Integer< list = new ArrayList<<(1000);

        // add some entries
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        // print size and capacity
        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + findCapacity(list));

        // trim capacity
        list.trimToSize();

        // print size and capacity
        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + findCapacity(list));
    }


    // method that returns the capacity of an ArrayList 
    static int findCapacity(ArrayList<Integer< al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}


