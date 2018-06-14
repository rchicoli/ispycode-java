import java.util.UUID;

public class Example {

   public static void main(String args[]) {

      // time based
      String uuid = "df7d094c-11ac-11e8-baf4-43639df9a4f9";
      System.out.println(getVersion(uuid));

      // name based
      uuid = "02d9e6d5-9467-382e-8f9b-9300a64ac3cd";
      System.out.println(getVersion(uuid));

      // random based
      uuid = "ca071410-ac78-413c-b436-8b46717583fc";
      System.out.println(getVersion(uuid));

      // DCE 
      uuid = "23932b60-2cbd-5366-9c36-8b374f1954a5";
      System.out.println(getVersion(uuid));

      // invalid UUID
      uuid = "invalid-uuid-string";
      System.out.println(getVersion(uuid));
   }

   static String getVersion(String name) {

      try {
         UUID uuid = UUID.fromString(name);
         switch (uuid.version()) {
            case 1:
               return "Time based UUID";
            case 3:
               return "Name based UUID";
            case 4:
               return "Randomly generated UUID";
            case 5:
               return "DCE security UUID";
            default:
               return "unknown";
         }
      } catch (IllegalArgumentException ex) {
         return "invalid";
      }
   }
}


