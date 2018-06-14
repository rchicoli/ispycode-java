import java.io.*;
import java.util.Date;

public class Example implements Runnable {

   static Process p;
   static String cmd = "sleep 10";

   public static void main(String[] args) throws InterruptedException {     
      System.out.println(new Date().toString());
      Example ex = new Example();
      ex.run();
      p.waitFor();
      System.out.println(new Date().toString());
   }

   public void run() {
      try {
         p = Runtime.getRuntime().exec(cmd);
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}


