public class Example {

   public static void main(String[] args) {
      String octal;
      for (int i = 0; i < 50; i++) {
         octal = Integer.toOctalString(i);
         System.out.println(i + ": " + octal);
      }
   }
}


