public class Example {

   public static void main(String[] args) {

      String str = "abcde";

      System.out.println(str.compareTo("abcde"));
      System.out.println(str.compareTo("abcdE"));
      System.out.println(str.compareTo("bcdef"));            
   }
}


