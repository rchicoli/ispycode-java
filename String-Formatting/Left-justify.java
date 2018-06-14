public class Example {

   public static void main(String[] args) {

      // eight characters wide left justify
      String str1 = String.format("This %-8d is a number.", 123);
      System.out.println(str1);

      // eight characters wide left justify
      String str2 = String.format("This %-8d is a number.", 98765);
      System.out.println(str2);

      // ten characters wide left justify
      System.out.printf("This %-10d is a number.\n", 12345678);

      // ten characters wide left justify
      System.out.printf("This %-10d is a number.\n", 12345);
   }
}


