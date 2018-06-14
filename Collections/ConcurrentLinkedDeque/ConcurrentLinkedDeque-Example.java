import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {

   static ConcurrentLinkedDeque<Integer< deque = new ConcurrentLinkedDeque<<();

   public static void main(String[] args) {
      ExecutorService service = Executors.newFixedThreadPool(2);
      Producer producer = new Producer();
      Consumer consumer = new Consumer();
      service.execute(producer);
      service.execute(consumer);
      service.shutdown();
   }

   static class Producer implements Runnable {

      @Override
      public void run() {
         for (int i = 1; i < 10; i++) {
            System.out.println("Produce: " + i);
            Example.deque.add(i);
            delay(1);
         }
      }
   }

   static class Consumer implements Runnable {

      @Override
      public void run() {
         for (int i = 1; i < 10; i++) {
            delay(2);
            System.out.println("Consume: " + Example.deque.poll());
         }

      }

   }

   static public void delay(int delay) {
      try {
         Thread.sleep(delay);
      } catch (InterruptedException e) {
      }
   }
}


