import java.util.ArrayList;

public class Example {

   public static void main(String[] args) {

      // create an empty array list
      ArrayList<String> al = new ArrayList<>();

      // add two item to the arraylist
      al.add("String1");
      al.add("String2");       
      System.out.println("Size: " + al.size());

      // empty arraylist
      al.clear();
      System.out.println("Size: " + al.size());        
   }
}


