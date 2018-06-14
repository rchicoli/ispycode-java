public class Example {

   public static void main(String[] args) {

      String str = "The cat in the hat";
      System.out.println(str);

      String[] tokens = str.split(" ");
      for (String s : tokens) {
         System.out.println(s);
      }
   }
}


