public class Example {

   public static void main(String args[]) {

      int a[] = new int[10];

      try {
         a[5] = 10 / 0;
      } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
         System.out.println(e.getMessage());
      } 
   }
}


