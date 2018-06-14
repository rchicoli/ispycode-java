enum Size {
   SMALL(),
   LARGE();
}

public class Example {

   public static void main(String[] args) {

      Size size = Size.LARGE;

      if (size == Size.SMALL) {
         System.out.println("This is SMALL");
      } else if (size == Size.LARGE) {
         System.out.println("This is LARGE");
      } else {
         System.out.println("Unknown SIZE " + size);
      }

   }
}


