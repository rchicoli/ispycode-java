enum Size {
   SMALL(),
   MEDIUM(),
   LARGE();
}

public class Example {

   public static void main(String[] args) {

      Size s1 = Size.SMALL;
      Size s2 = Size.SMALL;

      if (s1.equals(s2)) {
         System.out.println("SAME");
      }

      if (s1 == s2) {
         System.out.println("SAME");
      }
   }
}


