
public class Example {

   public static void main(String[] args) {

      int a = 1;
      int b = 2;

      System.out.println(true ? "Hello" : "Goodbye");
      System.out.println(false ? a : b);
      System.out.println((a < b) ? "Hello" : "Goodbye");
      System.out.println((b < a) ? (false ? "AAA" : "BBB") : "CCC");

   }
}


