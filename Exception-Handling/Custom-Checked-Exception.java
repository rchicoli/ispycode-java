public class Example {

   public static void main(String[] args) {

      try {
         throw new MyCheckedException("Checked Exception");
      } catch (MyCheckedException ex) {
         System.out.println(ex.getMessage());
      }
   }
}

class MyCheckedException extends Exception {

   public MyCheckedException(String message) {
      super(message);
   }
}


