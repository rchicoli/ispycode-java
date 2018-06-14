
public class Example {

   public static void main(String[] args) {

      int height = 5;
      int width = 20;

      for (int h = 1; h <= height; h++) {

         for (int w = 1; w <= width; w++) {
            if (h == 1 || h == height) {
               System.out.print('*');
            } else if (w == 1 || w == width) {
               System.out.print('*');
            } else {
               System.out.print(' ');
            }
         }
         System.out.println();

      }
   }
}


