
public class Example {

   public static void main(String[] args) {

      int height = 10;

      // top line
      for (int y = 1; y < height; y++) {
         System.out.print(" ");
      }
      System.out.println("*");

      // middle lines
      for (int x = 2; x < height; x++) {
         for (int y = 1; y <= height - x; y++) {
            System.out.print(" ");
         }
         System.out.print("*");
         for (int y = 1; y < x * 2 - 2; y++) {
            System.out.print(" ");
         }
         System.out.println("*");
      }

      // bottom line
      System.out.print("*");
      for (int y = 1; y < height * 2 - 2; y++) {
         System.out.print("*");
      }
      System.out.println("*");
   }
}


