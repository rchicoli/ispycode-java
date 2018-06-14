public class Example {

   public static void main(String[] args) {

      MyThread t = new MyThread();

      // start thread
      t.start();

      // sleep 1 second
      mysleep(1000);

      // test if thread is alive
      System.out.println("Is alive: " + t.isAlive());

      // sleep 4 seconds
      mysleep(4000);

      // the thread should be dead now
      System.out.println("Is alive: " + t.isAlive());
   }

   static class MyThread extends Thread {

      @Override
      public void run() {
         for (int i = 1; i < 5; i++) {
            System.out.println("MyThread loop: " + i);
            mysleep(1000);
         }
         System.out.println("MyThread finished");
      }
   }

   static void mysleep(int ticks){
      try {
         Thread.sleep(ticks);
      } catch (InterruptedException ex) {
      }
   }
}


