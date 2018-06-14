enum Size {
   SMALL(),
   MEDIUM(),
   LARGE();
}

public class Example {

   public static void main(String[] args) {

      for (Size size : Size.values()) {
         System.out.println(size);
      }
   }
}


