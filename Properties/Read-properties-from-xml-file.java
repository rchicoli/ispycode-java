import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Example {

   public static void main(String[] args) {

      File file = new File("/tmp/props.xml");

      try (FileInputStream fileInput = new FileInputStream(file)) {

         Properties props = new Properties();
         props.loadFromXML(fileInput);

         Enumeration e = props.keys();
         while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            System.out.println(key + " : " + props.getProperty(key));
         }

      } catch (Exception ex) {
         System.out.println("Exception");
      }
   }
}


