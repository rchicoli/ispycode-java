import java.util.Calendar;
import java.util.Locale;

public class Example {

   public static void main(String args[]) {

      Calendar now = Calendar.getInstance();
      Locale locale = Locale.getDefault();

      String month = now.getDisplayName(Calendar.MONTH,Calendar.LONG, locale);
      System.out.println(month);

      String day = now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
      System.out.println(day);
   }
}


