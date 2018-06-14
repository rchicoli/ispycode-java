import java.util.Calendar;

public class Example {

   public static void main(String args[]) {

      Calendar now = Calendar.getInstance();

      System.out.println("Month: " + (now.get(Calendar.MONTH) + 1));
      System.out.println("Day: " + now.get(Calendar.DAY_OF_MONTH));
      System.out.println("Year: " + now.get(Calendar.YEAR));
   }
}


