import java.io.*;

public class Example implements Runnable {

   static Process p;
   static String cmd = "sleep 100";

   public static void main(String[] args) throws InterruptedException {     
      Example ex = new Example();
      ex.run();
      System.out.println(p.isAlive());
      p.destroy();
      Thread.sleep(1000);
      System.out.println(p.isAlive());
   }

   public void run() {
      try {
         p = Runtime.getRuntime().exec(cmd);
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}


