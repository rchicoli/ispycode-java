import java.util.Date;

public class Example {

   public static void main(String a[]) {

      //get current time in milli-seconds
      long currentTimeInSec = System.currentTimeMillis();

      // create Date object from milli-seconds
      Date d = new Date(currentTimeInSec);
      System.out.println(d);
   }
}


