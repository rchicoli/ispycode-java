
public class Example {

   public static void main(String[] args) {

      // get the state of the thread
      Enum state = Thread.currentThread().getState();

      // print the state 
      System.out.println(state);
   }
}


