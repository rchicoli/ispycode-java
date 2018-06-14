import java.util.Calendar;

public class Example {

   public static void main(String args[]) {

      Calendar cal = Calendar.getInstance();
      System.out.println(cal.getTime().toString());

      // Change YEAR, MONTH, and DAY_OF_MONTH.
      // 2017 May 32
      cal.set(2017, 4, 31);
      System.out.println(cal.getTime().toString());

      // Change YEAR, MONTH, DAY_OF_MONTH, HOUR, MINUTE, and SECOND
      // 2000 Jan 1, 6:30:45
      cal.set(2000, 0, 1, 6, 30, 45);
      System.out.println(cal.getTime().toString());

   }  
}


