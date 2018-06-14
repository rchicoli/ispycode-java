import java.util.UUID;

public class Example {

   public static void main(String args[]) {

      String str1 = "77da92db-0791-491e-8c58-1a969e67d2fe";
      System.out.println(isUUID(str1));

      String str2 = "This-is-an-invalid-UUID-String";
      System.out.println(isUUID(str2));

   }

   static boolean isUUID(String string) {
      try {
         UUID.fromString(string);
         return true;
      } catch (Exception ex) {
         return false;
      }
   }
}


