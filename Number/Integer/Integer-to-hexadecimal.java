public class Example {

   public static void main(String[] args) {
      String hex;
      for (int i = 0; i < 50; i++) {
         hex = Integer.toHexString(i);
         System.out.println(i + ": " + hex);
      }
   }
}


