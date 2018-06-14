
public class Example {

   public static void main(String[] args) {

      String str = "The cat in the hat is a cat";

      // first occurrence of the char.
      int i3 = str.indexOf('c');
      System.out.println("c index: " + i3);

      // index of the char from starting point
      int i4 = str.indexOf('c', 5);
      System.out.println("c index: " + i4);

      // get all the indexs of a char
      int i = 0;
      System.out.print("a indexes:");
      while((i = str.indexOf('a',i)) != -1) {
         System.out.print(" " + i++);
      }
      System.out.println();

   }
}


