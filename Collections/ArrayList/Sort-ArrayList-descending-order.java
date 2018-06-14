import java.util.ArrayList;
import java.util.Collections;

public class Example {

   public static void main(String[] args) throws Exception {

      // create first ArrayList.
      ArrayList<Integer< list = new ArrayList<<();
      list.add(20);
      list.add(40);
      list.add(60);
      list.add(10);
      list.add(30);
      list.add(50);
      System.out.println(list);      

      // Sort in decreasing order
      Collections.sort(list, Collections.reverseOrder());
      System.out.println(list);      
   } 
}


