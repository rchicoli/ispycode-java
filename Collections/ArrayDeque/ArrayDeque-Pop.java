import java.util.ArrayDeque;

public class Example {

   public static void main(String[] args) {

      // create ArrayDeque
      ArrayDeque<Integer> ad = new ArrayDeque<>();

      // add elements with offer
      ad.push(10);
      ad.push(20);
      ad.push(30);

      // print out ArrayDeque
      System.out.println(ad);

      // pop element off stack
      int i = ad.pop();
      System.out.println("i: " + i);

      // print out ArrayDeque
      System.out.println(ad);
   }
}


