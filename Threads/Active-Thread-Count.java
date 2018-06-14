
public class Example {

   public static void main(String[] args) {

      // spawn off 20 threads
      for (int i = 0; i < 20; i++) {
         new MyThread().start();
      }

      // There should be 21 active threads
      // The main thread plus the 20 spawned
      System.out.println("Thread count: " + Thread.activeCount());

   }

   static class MyThread extends Thread {

      @Override
      public void run() {
         try {
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
         }
      }
   }
}


