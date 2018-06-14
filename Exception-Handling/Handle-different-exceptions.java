public class Example {

   public static void main(String args[]) {

      int a[] = new int[10];

      try {
         a[5] = 10 / 0;
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic Exception");
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Out Of Bounds Exception");
      } catch (Exception e) {
         System.out.println("General Error");
      }
   }
}


