import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create ArrayDeque
      ArrayDeque<Integer> stack = new ArrayDeque<>();

      // push elements onto stack
      stack.push(10);
      stack.push(20);
      stack.push(30);
      System.out.println("stack: " + stack);

      // pop element off stack
      int e = stack.pop();
      System.out.println("popped: " + e);
      System.out.println("stack: " + stack);


      // peek for emement
      e = stack.peek();
      System.out.println("peeked: " + e);
      System.out.println("stack: " + stack);


      // is stack empty
      boolean empty = stack.isEmpty();
      System.out.println("empty: " + empty);

      // stack size
      int size = stack.size();
      System.out.println("size: " + size);

   }
}


