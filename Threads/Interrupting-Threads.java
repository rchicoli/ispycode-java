public class Example {

   public static void main(String[] args) throws InterruptedException {

      MyThread t = new MyThread();

      // start thread
      t.start();

      // test if thread has been interrupted
      System.out.println(t.isInterrupted());

      // send an interruption to the tread
      t.interrupt();

      // test if thread has been interrupted 
      System.out.println(t.isInterrupted());
   }

   static class MyThread extends Thread {

      @Override
      public void run() {
         try {

            // sleep for a second
            Thread.sleep(1000);

         } catch (InterruptedException ex) {

            // generate a message if thread was interrupted
            System.out.println("Interrupted");
         }
      }
   }
}


