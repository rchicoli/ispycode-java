import java.io.IOException;
import java.util.Scanner;

public class Example {

   public static void main(String[] args) throws IOException {

      ProcessBuilder pb = new ProcessBuilder("env");
      pb.environment().put("MYENV", "hello");
      Process process = pb.start();
      Scanner sc = new Scanner(process.getInputStream());
      while (sc.hasNext()) {
         String line = sc.nextLine();
         if (line.contains("MYENV")) {
            System.out.println(line);
         }
      }
   }
}


