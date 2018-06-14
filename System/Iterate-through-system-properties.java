import java.util.Enumeration;
import java.util.Properties;

public class Example {

   public static void main(String[] args) {
      Properties props = System.getProperties();
      Enumeration e = props.propertyNames();

      while (e.hasMoreElements()) {
         String key = (String) e.nextElement();
         System.out.println(key + " -- " + props.getProperty(key));
      }

   }
}


