public class Example {

   public static void main(String[] args) {

      // create three threads
      MyThread t1 = new MyThread();
      MyThread t2 = new MyThread();
      MyThread t3 = new MyThread();

      // start the threads
      t1.start();
      t2.start();
      t3.start();

      // change priority
      t1.setPriority(Thread.MIN_PRIORITY);
      t1.setPriority(4);
      t3.setPriority(Thread.MAX_PRIORITY);


      // print priority
      System.out.println("t1 priority: " + t1.getPriority());
      System.out.println("t2 priority: " + t2.getPriority());
      System.out.println("t3 priority: " + t3.getPriority());

   }

   static class MyThread extends Thread {

      @Override
      public void run() {
         // sleep for two seconds
         try {
            Thread.sleep(2000);
         } catch (InterruptedException ex) {
         }
      }
   }
}


