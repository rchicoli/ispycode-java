import java.io.*;

public class Example {

   public static void main(String[] args){

      try {
         Process p = Runtime.getRuntime().exec("ls");
         p.waitFor();
         System.out.println(p.exitValue());

      } catch (IOException | InterruptedException e) {
         System.out.println(e.getMessage());
      }

      try {
         Process p = Runtime.getRuntime().exec("ls /no_dir");
         p.waitFor();
         System.out.println(p.exitValue());

      } catch (IOException | InterruptedException e) {
         System.out.println(e.getMessage());
      }
   }
}



