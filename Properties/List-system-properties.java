import java.util.Enumeration;
import java.util.Properties;

public class Example {

   public static void main(String[] args) {

      Properties props = System.getProperties();
      Enumeration enuProp = props.propertyNames();
      while (enuProp.hasMoreElements()) {
         String name = (String) enuProp.nextElement();
         String value = props.getProperty(name);
         System.out.println(name + ": " + value);
      }
   }
}


