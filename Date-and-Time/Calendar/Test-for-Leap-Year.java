import java.util.GregorianCalendar;

public class Example {

   public static void main(String args[]) {

      GregorianCalendar cal = new GregorianCalendar();

      // leap years between 1900 and 2000
      for (int year = 1900; year <= 2000; year++) {
         if (cal.isLeapYear(year)) {
            System.out.println(year);
         }

      }
   }
}


