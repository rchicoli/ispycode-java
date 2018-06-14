
public class NestedForLoop {

   public static void main(String[] args) {

      int count = 0;

      // outter loop runs 20 times
      for (int i = 0; i < 20; i++) {

         // inner loop runs 10 times
         for (int j = 0; j < 10; j++) {
            count = count + 1;
         }

      }

      // 20 times 10 == 200
      System.out.println("count: " + count);
   }
}


