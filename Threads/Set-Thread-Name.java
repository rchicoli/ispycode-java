
public class Example {

   public static void main(String[] args) {

      // get the current thread
      Thread thread = Thread.currentThread();

      // change the name of the thread 
      thread.setName("welcome thread");

      // print the thread name
      System.out.println(thread.getName());
   }
}


