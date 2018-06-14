public class Example {

   public static void main(String[] args) {
      String binary;
      for (int i = 0; i < 50; i++) {
         binary = Integer.toBinaryString(i);
         System.out.println(i + ": " + binary);
      }
   }
}


