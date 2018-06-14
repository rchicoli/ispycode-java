import java.util.Calendar;
import java.util.Date;

public class Example {

   public static void main(String args[]) {

      // May 1,2017
      Calendar cal = Calendar.getInstance();
      cal.set(2017, 4, 1);
      System.out.println(cal.getTime().toString());

      // get current date
      Date date = new Date();
      System.out.println(date);

      // Set time and date from Date object
      cal.setTime(date);
      System.out.println(cal.getTime().toString());
   }
}


