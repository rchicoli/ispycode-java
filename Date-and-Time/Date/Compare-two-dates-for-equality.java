import java.util.Date;

public class Example {

   public static void main(String a[]) {

      // May 1, 2015
      Date d1 = new Date(115, 4, 1);
      System.out.println("d1: " + d1);

      // June 1, 2015
      Date d2 = new Date(115, 5, 1);
      System.out.println("d2: " + d2);

      // June 1, 2015
      Date d3 = new Date(115, 5, 1);
      System.out.println("d3: " + d3);

      // is d1 and d2 the same date?
      if(! d1.equals(d2)) {
         System.out.println("d1 and d2 are different");
      }

      // is d2 and d3 the same date?
      if(d2.equals(d3)) {
         System.out.println("d2 and d3 are the same");
      }
   }
}


