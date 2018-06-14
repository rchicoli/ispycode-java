import java.util.Set;
import java.util.TreeSet;

public class Example {

   public static void main(String[] args) {

      // create an empty TreeSet
      TreeSet<Integer< set = new TreeSet<<();

      // add elements to the HashSet
      set.add(10);
      set.add(50);
      set.add(60);
      set.add(30);
      set.add(25);

      System.out.println(set);

      // Get subset in range 25 to 50
      Set<Integer< subset = set.subSet(25,50);

      System.out.println(subset);

   }
}


