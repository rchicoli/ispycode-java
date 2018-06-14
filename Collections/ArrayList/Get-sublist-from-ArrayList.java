import java.util.ArrayList;

public class Example {

   public static void main(String[] args) throws Exception {

      // create first ArrayList.
      ArrayList<Integer< list = new ArrayList<<();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      list.add(60);
      System.out.println(list);

      // get a sublist
      ArrayList<Integer< sublist = new ArrayList<<(list.subList(1, 3));
      System.out.println(sublist);      
   }  
}


