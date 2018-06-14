public class Example {

   public static void main(String[] args) {

      throw new MyUncheckedException("Unchecked Exception");
   }
}

class MyUncheckedException extends RuntimeException {

   public MyUncheckedException(String message) {
      super(message);
   }
}


