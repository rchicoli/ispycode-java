
public class Example {

   public static void main(String[] args) {

      System.out.println("Print number after pausing for a second");
      try {

         for (int i = 0; i < 3; i++) {
            System.out.println(i);
            Thread.sleep(1000);
         }
      } catch (InterruptedException ie) {
         System.out.println("Thread interrupted !" + ie);
      }

   }
}


