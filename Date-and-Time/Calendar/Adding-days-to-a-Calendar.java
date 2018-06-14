import java.util.Calendar;

public class Example {

   public static void main(String args[]) {

      Calendar calendar = Calendar.getInstance();
      System.out.println(calendar.getTime().toString());

      // add one day to a Calendar
      calendar.add(Calendar.DATE, 1);
      System.out.println(calendar.getTime().toString());

      // subtract 20 days from the Calendar
      calendar.add(Calendar.DATE, -20);
      System.out.println(calendar.getTime().toString());

   }
}


