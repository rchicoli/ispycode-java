public class Example {

   public static void main(String[] args) {

      // create two thread groups
      ThreadGroup tg1 = new ThreadGroup("thread group one");
      ThreadGroup tg2 = new ThreadGroup("thread group two");

      // create five threads and assign to a group
      Thread t1 = new MyThread(tg1, "thread 1");
      Thread t2 = new MyThread(tg1, "thread 2");
      Thread t3 = new MyThread(tg2, "thread 3");
      Thread t4 = new MyThread(tg2, "thread 4");
      Thread t5 = new MyThread(tg2, "thread 5");

      // start each thread
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();

      System.out.println("== thread group 1 ==");
      Thread arr1[] = new Thread[tg1.activeCount()];
      tg1.enumerate(arr1);
      for (Thread t : arr1) {
         System.out.println(t.getName());
      }

      System.out.println("== thread group 2 ==");
      Thread arr2[] = new Thread[tg2.activeCount()];
      tg2.enumerate(arr2);
      for (Thread t : arr2) {
         System.out.println(t.getName());
      }

   }

   static class MyThread extends Thread {

      private MyThread(ThreadGroup tg, String name) {
         super(tg, name);
      }

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


