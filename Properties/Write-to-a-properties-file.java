import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class Example {

   public static void main(String[] args) {

      Properties properties = new Properties();
      properties.setProperty("phone", "800-555-1212");
      properties.setProperty("email", "myemail@ipyscode.com");

      File file = new File("/tmp/props.txt");
      try (FileOutputStream fileOut = new FileOutputStream(file)) {
         properties.store(fileOut, "Contact Info");
      } catch (Exception ex) {
         System.out.println("Exception");
      }
   }
}


