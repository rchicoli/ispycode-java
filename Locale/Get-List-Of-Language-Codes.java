
import java.util.Locale;

public class Example {

   public static void main(String[] args) {

      // get all 2-letter language codes
      String languages[] = Locale.getISOLanguages();

      // print languages
      int i = 1;
      for (String language : languages) {
         System.out.print(language);
         if(i++ % 15 == 0){
            System.out.println();
         } else {
            System.out.print(" ");
         }
      }

   }
}


