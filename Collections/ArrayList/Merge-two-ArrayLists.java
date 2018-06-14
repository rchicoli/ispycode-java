import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      // create first array list
      ArrayList<String< list1 = new ArrayList();
      list1.add("Apple");
      list1.add("Orange");
      System.out.println(String.join(",", list1));

      // create second array list
      ArrayList<String< list2 = new ArrayList();
      list2.add("Grape");
      list2.add("Plum");
      System.out.println(String.join(",", list2));

      // combine ArrayLists
      ArrayList<String< list3 = new ArrayList<String<();
      list3.addAll(list1);
      list3.addAll(list2);

      // print out combined list
      System.out.println(String.join(",", list3));

   }
}


