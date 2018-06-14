import java.util.Calendar;
import java.util.TimeZone;

public class Example {

   public static void main(String args[]) {


      Calendar cal = Calendar.getInstance();
      System.out.println("TZ: " + cal.getTimeZone().getDisplayName());

      // Change timezone
      TimeZone tz = TimeZone.getTimeZone("Europe/Moscow");
      cal.setTimeZone(tz);
      System.out.println("TZ: " + cal.getTimeZone().getDisplayName());

   }
}


