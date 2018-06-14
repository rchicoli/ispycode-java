
public class Example {

   public static void main(String[] args) {

      MyRunnable myrun = new MyRunnable();
      Thread thread = new Thread(myrun);
      thread.start();

   }

}

class MyRunnable implements Runnable {

   @Override
   public void run() {
      System.out.println("MyRunnable running...");
   }
}


