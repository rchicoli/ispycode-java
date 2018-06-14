public class Example {

   public static void main(String args[]) {

      try {
         method();

      } catch (ArithmeticException e) {
         System.out.println("Inside main:");
         System.out.println(e.getMessage());
      }
   }

   public static void method() {
      try {
         int x = 10 / 0;

      } catch (ArithmeticException e) {
         System.out.println("Inside method:");
         System.out.println(e.getMessage());
         throw e;
      }
   }
}


