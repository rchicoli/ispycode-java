public class Example {

   public static void main(String[] args) {

      // eight characters in wide
      String str1 = String.format("%8d", 123);
      System.out.println(str1);

      // seven characters in wide
      String str2 = String.format("%7d", 5678);
      System.out.println(str2);

      // eight characters in wide
      System.out.printf("%8d\n", 12345678);

      // five characters in wide
      System.out.printf("%5d\n", 1234);
   }
}


