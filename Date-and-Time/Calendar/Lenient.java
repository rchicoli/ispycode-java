import java.util.Calendar;

public class Example {

   public static void main(String args[]) {

      Calendar cal = Calendar.getInstance();
      System.out.println(cal.getTime().toString());

      cal.set(1996, 1, 942);
      System.out.println(cal.getTime().toString());

      cal.setLenient(false);
      try {
         // try it again
         cal.set(1996, 1, 942);
         System.out.println(cal.getTime().toString());
      } catch (Exception e) {
         System.out.println(e.toString());
      }

   }
}


