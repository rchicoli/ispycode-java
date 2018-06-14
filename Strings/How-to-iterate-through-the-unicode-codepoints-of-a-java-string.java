
public class Example {

   public static void main(String[] args) {

      String hw = "Hello World";
      for (int i = 0; i < hw.length(); i++) {
         System.out.println(hw.charAt(i) + " " + hw.codePointAt(i)); 
      }     
   }
}


