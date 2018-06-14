
public class Example {

   public static void main(String[] args) {

      int height = 10;
      for (int i = 0; i < height; ++i) {
         for (int j = -height + 1; j < -i; ++j) {
            System.out.print(" ");
         }
         for (int j = -i; j <= i; ++j) {
            if (j == 0) {
               System.out.print("|");
            } else if (j < 0) {
               System.out.print("\\");
            } else {
               System.out.print("/");
            }
         }
         System.out.println("");
      }
   }
}


