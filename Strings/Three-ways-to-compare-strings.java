public class Example {

   public static void main(String[] args) {

      String str1 = "Hello";
      System.out.println(str1);

      String str2 = "Hello";
      System.out.println(str2);

      // using the == operator
      if (str1 == str2) {
         System.out.println("Equals");
      }

      // using the equals method
      if (str1.equals(str2)) {
         System.out.println("Equals");
      }

      // using the compareTo method
      if (str1.compareTo(str2) == 0) {
         System.out.println("Equals");
      }

   }
}


