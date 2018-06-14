enum Size {
   SMALL(),
   MEDIUM(),
   LARGE();
}

public class Example {

   public static void main(String[] args) {

      Size size = Size.MEDIUM;

      switch (size) {
         case SMALL:
            System.out.println("This is SMALL");
            break;
         case MEDIUM:
            System.out.println("This is MEDIUM");
            break;
         case LARGE:
            System.out.println("This is LARGE");
            break;
         default:
            throw new AssertionError("Unknown SIZE " + size);

      }
   }
}


