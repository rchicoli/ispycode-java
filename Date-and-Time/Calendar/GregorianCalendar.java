import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example {

   public static void main(String args[]) {

      Calendar gc = new GregorianCalendar(2017, Calendar.MAY, 31);
      System.out.println(gc.getTime().toString());

   }
}


