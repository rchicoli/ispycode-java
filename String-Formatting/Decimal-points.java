public class Example {

   public static void main(String[] args) {

      // 5 decimal points
      String str1 = String.format("%.5f",12.345);
      System.out.println(str1);

      // 10 decimal points
      String str2 = String.format("%.10f",55.1236);
      System.out.println(str2);

      // 2 decimal points
      System.out.printf("%.2f \n",55.1236);

      // 1 decimal point
      System.out.printf("%.1f \n",123.000000000);
   }
}


