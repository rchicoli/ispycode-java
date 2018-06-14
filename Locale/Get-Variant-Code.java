
import java.util.Locale;

public class Example {

   public static void main(String[] args) {

      // get the default locale 
      Locale locale = new Locale("en", "us", "downeast");

      // get variant
      String variant = locale.getDisplayVariant();

      // print variant
      System.out.println(variant);

   }
}


