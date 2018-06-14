import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Example {

   public static void main(String[] args) throws IOException {
      Properties props = new Properties();
      props.setProperty("phone", "800-555-1212");
      props.setProperty("email", "myemail@ipyscode.com");

      //where to store?
      OutputStream os = new FileOutputStream("/tmp/props.xml");

      props.storeToXML(os, "My Properties");
   }
}


