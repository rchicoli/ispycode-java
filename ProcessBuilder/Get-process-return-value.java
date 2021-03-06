import java.io.IOException;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) throws IOException {

      ProcessBuilder pb = new ProcessBuilder("ls");
      Process process = pb.start();
      Scanner sc = new Scanner(process.getErrorStream());
      while (sc.hasNext()) {
         System.out.println(sc.nextLine());
      }
      System.out.println(process.exitValue());
   }
}


