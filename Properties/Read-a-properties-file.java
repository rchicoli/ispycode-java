import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Example {

   public static void main(String[] args) {

      File file = new File("/tmp/props.txt");

      try (FileInputStream fileInput = new FileInputStream(file)) {

         Properties properties = new Properties();
         properties.load(fileInput);

         Enumeration enuKeys = properties.keys();
         while (enuKeys.hasMoreElements()) {
            String key = (String) enuKeys.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
         }

      } catch (Exception ex) {
         System.out.println("Exception");
      }
   }
}


