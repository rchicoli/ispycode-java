import java.util.TreeSet;

public class Example {

   public static void main(String[] args) {

      // create TreeSet
      TreeSet<Integer< set = new TreeSet<<();

      // add elements
      set.add(10);
      set.add(50);
      set.add(20);
      set.add(60);

      System.out.println(set);

      int lowest = set.first();
      System.out.println(lowest);

   }
}


