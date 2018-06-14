
import java.util.Locale;

public class Example {

   public static void main(String[] args) {

      // get locale using a language tag string.
      Locale locale = Locale.forLanguageTag("en-GB");

      // get country/region code
      String country = locale.getDisplayCountry();

      // print locale
      System.out.println(country);

   }
}


