
public class Example {

   public static void main(String[] args) {

      int n = 10;

      for (int i = -n; i <= n; i++) {
         for (int j = -n; j <= n; j++) {
            if (i * i + j * j <= n * n) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }
}


