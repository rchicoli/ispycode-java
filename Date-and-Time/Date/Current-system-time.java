import java.util.Date;

public class Example {

   public static void main(String[] args) {

      // current time in milliseconds
      long ms = System.currentTimeMillis();
      System.out.println(ms);

      // create date from milliseconds
      Date d = new Date(ms);

      // print date
      System.out.println(d);
   }
}


