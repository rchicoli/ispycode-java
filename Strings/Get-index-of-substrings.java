
public class Example {

   public static void main(String[] args) {

      String str = "The cat in the hat is a cat";

      // first occurrence of the substring.
      int i3 = str.indexOf("cat");
      System.out.println("cat index: " + i3);

      // index of the substring from starting point
      int i4 = str.indexOf("cat", 5);
      System.out.println("cat index: " + i4);

      // get all the indexes of a substring
      int i = 0;
      System.out.print("cat indexes:");
      while((i = str.indexOf("cat", i)) != -1) {
         System.out.print(" " + i++);
      }
      System.out.println();

   }
}


