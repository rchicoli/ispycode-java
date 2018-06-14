public class Example {

   public static void main(String[] args) {

      Integer[] numbers = { 1, 2, 3, 4, 5 };
      String[] colors = { "Red", "Orange", "Green" };

      printArray(numbers);   
      printArray(colors);   
   }

   public static <E< void printArray(E[] arr) {
      for (E e : arr) {
         System.out.print(e + " ");
      }
      System.out.println();
   }
}


