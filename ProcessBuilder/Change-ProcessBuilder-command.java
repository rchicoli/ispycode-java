import java.io.IOException;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) throws IOException {

      ProcessBuilder pb = new ProcessBuilder("pwd");
      System.out.println(pb.command());

      pb.command("ls");
      System.out.println(pb.command());

      Process process = pb.start();
      Scanner sc = new Scanner(process.getInputStream());
      while (sc.hasNext()) {
         System.out.println(sc.nextLine());
      }
   }
}


