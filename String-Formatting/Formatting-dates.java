import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example {

   public static void main(String[] args) {

      // June 1 2017
      Calendar c = new GregorianCalendar(2017,5,1);

      // locale-specific full name of month.
      System.out.format("%tB \n", c);

      // 2 digit day of month
      System.out.format("%te \n", c);

      // 2 digit day of month with leading zero (if needed)
      System.out.format("%td \n", c);

      // 4 digit year
      System.out.format("%tY \n", c);

      // 2 digit year
      System.out.format("%ty \n", c);

      // date as MM/DD/YY
      System.out.format("%tD \n", c);

      // month day year example
      System.out.format("%tB %te, %tY%n", c, c, c);
   }
}


