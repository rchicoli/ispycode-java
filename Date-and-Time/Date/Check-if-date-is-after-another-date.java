import java.util.Date;

public class Example {

   public static void main(String a[]) {

      // May 1, 2015
      Date d1 = new Date(115,4,1);
      System.out.println("d1: " + d1);

      // Jul 1, 2015
      Date d2 = new Date(115, 6, 1);
      System.out.println("d2: " + d2);

      // Is d2 after d1?
      if(d2.after(d1)){
         System.out.println("d2 is after d1");
      }
   }
}


