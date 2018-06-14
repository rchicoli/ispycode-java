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

      // is d1 before d2
      if (d1.compareTo(d2) < 0) {
         System.out.println("d1 is before d2");
      }

      // Is d2 after d1?
      if (d2.compareTo(d1) < 0) {
         System.out.println("d2 is after d1");
      }

      // Is d2 the same date a d3
      if (d2.compareTo(d3) ==  0) {
         System.out.println("d2 is same as d3");
      }
   }
}


