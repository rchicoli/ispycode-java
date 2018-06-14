public class Example {

   public static void main(String args[]) {

      double d = Math.nextAfter(10, 100);
      System.out.println(d);

      d = Math.nextAfter(-10, 100);
      System.out.println(d);

      d = Math.nextAfter(10, -100);
      System.out.println(d);

      d = Math.nextAfter(-10, -100);
      System.out.println(d);
   }
}


