public class Example {

   public static void main(String[] args) {

      // eight characters in wide with leading zeros
      String str1 = String.format("%08d", 123);
      System.out.println(str1);

      // seven characters in wide with leading zeros
      String str2 = String.format("%07d", 5678);
      System.out.println(str2);

      // ten characters in wide with leading zeros
      System.out.printf("%010d\n", 12345678);

      // five characters in wide with leading zeros
      System.out.printf("%05d\n", 1234);
   }
}


