
public class Example {

   public static void main(String[] args) {

      // Create a string buffer
      StringBuffer sb = new StringBuffer("Hello World");

      // create a new string with a string buffer
      String str = new String(sb);
      System.out.println(str);

   }
}


