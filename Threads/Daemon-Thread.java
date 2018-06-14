public class Example {

   public static void main(String[] args) {

      DaemonThread daemon = new DaemonThread();

      // mark thread as a daemon
      daemon.setDaemon(true);

      // start thread
      daemon.start();

      // test if thread is a daemon
      System.out.println("Daemon: " + daemon.isDaemon());

   }

   static class DaemonThread extends Thread {

      @Override
      public void run() {
         try {
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
         }
      }
   }
}


