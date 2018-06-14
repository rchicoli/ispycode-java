public class Example {

   public static void main(String[] args) {

      String str = "";
      if (str != null) {
         System.out.println(str);
         System.out.println("Empty: " + str.isEmpty());
      }

      str = "Hello";
      if (str != null) {
         System.out.println(str);
         System.out.println("Empty: " + str.isEmpty());
      }      
   }
}


