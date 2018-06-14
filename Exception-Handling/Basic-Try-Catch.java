public class Example {

   public static void main(String[] args) {

      try {
         // may throw exception  
         int data = 50 / 0;

      } catch (Exception e) {

         System.out.println(e.getMessage());
      }
   }
}


