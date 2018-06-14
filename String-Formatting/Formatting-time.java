import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example {

   public static void main(String[] args) {
      // February 26, 2017 4:09:05 PM
      Calendar c = new GregorianCalendar(2017,1,26,16,9,5);

      // hour - 12-hour clock
      System.out.format("%tl \n", c);

      // hour - 12-hour clock leading zero
      System.out.format("%tI \n", c);

      // hour - 24-hour clock
      System.out.format("%tk \n", c);

      // hour - 24-hour clock leading zero
      System.out.format("%tH \n", c);

      // Minutes with leading zeros
      System.out.format("%tM \n", c);

      // Seconds with leading zeros
      System.out.format("%tM \n", c);

      // AM or PM lowercase
      System.out.format("%tS \n", c);

      // AM or PM uppercase
      System.out.format("%Tp \n", c);

      // HH:MM:SS
      System.out.format("%tl:%tM:%tS \n", c, c, c);

   }
}


