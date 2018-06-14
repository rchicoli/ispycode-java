import java.util.Calendar;

public class Example {

   public static void main(String args[]) {

      // Jan 1,2017
      Calendar c1 = Calendar.getInstance();
      c1.set(2017, 0, 1);
      System.out.println(c1.getTime().toString());

      // May 1,2017
      Calendar c2 = Calendar.getInstance();
      c2.set(2017, 4, 1);
      System.out.println(c2.getTime().toString());

      if(c1.compareTo(c2) < 0){
         System.out.println("c1 is before c2");
      }

      if (c2.compareTo(c1) > 0) {
         System.out.println("c2 is after c1");
      }

      if (c1.compareTo(c2) == 0) {
         System.out.println("c1 is the same as c2");
      }

   }
}


