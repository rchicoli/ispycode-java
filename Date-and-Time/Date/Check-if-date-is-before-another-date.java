import java.util.Date;

public class Example {

   public static void main(String a[]) {

      // May 1, 2015
      Date d1 = new Date(115,4,1);
      System.out.println("d1: " + d1);

      // Jul 1, 2015
      Date d2 = new Date(115, 6, 1);
      System.out.println("d2: " + d2);

      // Is d1 before d2?
      if(d1.before(d2)){
         System.out.println("d1 is before d2");
      }
   }
}


