import java.util.Random;

public class Example {

   public static void main(String[] args) {
      Random rand = new Random();

      float f1, f2, f3;

      // print name of headings
      System.out.printf("%8s %8s %8s\n","col 1","col 2","col 3");

      // print divider
      String str = "--------";
      System.out.printf("%8s %8s %8s\n",str,str,str);

      // print rows of floats
      for (int i = 0; i < 10; i++) {
         f1 = rand.nextFloat() * 1000;
         f2 = rand.nextFloat() * 1000;
         f3 = rand.nextFloat() * 1000;

         // each column has 8 spaces with two decimal points
         System.out.printf("%8.2f %8.2f %8.2f \n", f1, f2, f3);
      }
   }
}


