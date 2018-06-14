public class Example {

   public static void main(String[] args) {

      Thread.currentThread().setName("Main Thread");

      // spawn off 5 threads
      for (int i = 1; i <= 5; i++) {
         new MyThread("My Thread " + i).start();
      }

      int count = Thread.activeCount();
      Thread arr[] = new Thread[count];
      Thread.enumerate(arr);

      for(Thread t: arr){
         System.out.println(t.getName());
      }


   }

   static class MyThread extends Thread {

      private MyThread(String name) {
         this.setName(name);
      }

      @Override
      public void run() {
         try {
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
         }
      }
   }
}


