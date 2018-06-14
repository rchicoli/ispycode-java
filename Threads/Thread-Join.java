public class Example {

   public static void main(String[] args) throws InterruptedException {

      System.out.println("Started");
      MyThread t1 = new MyThread(6000);
      MyThread t2 = new MyThread(2000);
      MyThread t3 = new MyThread(3000);
      t1.start();
      t2.start();
      t3.start();
      t1.join();
      t2.join();
      t3.join();
      System.out.println("Finished");

   }

   static class MyThread extends Thread {

      int sleep;

      MyThread(int sleep) {
         this.sleep = sleep;
      }

      @Override
      public void run() {
         System.out.println("Begin: " + this.getName());
         try {
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
         }
         System.out.println("End: " + this.getName());
      }
   }
}


