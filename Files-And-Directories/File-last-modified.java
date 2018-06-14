import java.io.File;
import java.util.Date;

public class Example {

   public static void main(String[] args) {

      File file = new File("/tmp/myfile");
      Date date = new Date(file.lastModified());
      System.out.println(date);

   }
}


