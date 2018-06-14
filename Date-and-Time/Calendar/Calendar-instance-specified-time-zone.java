import java.util.Calendar;
import java.util.TimeZone;

public class Example {

   public static void main(String args[]) {

      TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");

      Calendar now = Calendar.getInstance(tz);

      System.out.println("Hour  : " + now.get(Calendar.HOUR));
      System.out.println("Day   : " + now.get(Calendar.MINUTE));

      // offset from GMT in milliseconds.
      System.out.println("OFFSET: " + now.get(Calendar.ZONE_OFFSET));
   }
}


