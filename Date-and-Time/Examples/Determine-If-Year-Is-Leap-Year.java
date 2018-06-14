
public class LeapYearExample {

   public static void main(String[] args) {

      int year = 1999;

      //if year is divisible by 4, it is a leap year
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
         System.out.println("Year " + year + " is a leap year");
      } else {
         System.out.println("Year " + year + " is not a leap year");
      }
   }
}


