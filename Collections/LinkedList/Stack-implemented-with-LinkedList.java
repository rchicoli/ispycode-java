import java.util.LinkedList;

public class Example {

   public static void main(String[] args) {

      // create stack implemented with LinkedList
      LinkedList<Integer> list = new LinkedList<>();

      // push elements onto the stack
      for (int i = 1; i <= 5; i++) {
         list.push(i);
         System.out.println("pushed: " + i);
         System.out.println(list);
      }

      // pop elements from stack
      while (list.size() > 0) {
         Integer i = list.pop();
         System.out.println("popped: " + i);
         System.out.println(list);
      }

   }
}


