import java.util.Date;

public class Example {

   public static void main(String a[]) {

      // December 25, 2017
      Date xmas = new Date(117, 11, 25);
      System.out.println("xmas : " + xmas);

      // March 12, 2017
      Date today = new Date(117, 2, 12);
      System.out.println("today: " + today);

      long milliseconds = xmas.getTime() - today.getTime();

      long seconds = milliseconds / 1000;
      long minutes = seconds / 60;
      long hours = minutes / 60;
      long days = hours / 24;

      System.out.println("Difference in days: " + days);

   }
}


