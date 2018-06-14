import java.util.Arrays;
import java.util.Random;

public class Example {

   public static void main(String[] args) {
      int[] arr = {8, 6, 4, 2, 0, 1, 3, 5, 7, 9};
      System.out.println("Unsorted: " + Arrays.toString(arr));
      bogoSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }

   public static void bogoSort(int[] arr) {
      Random rand = new Random();
      while (!isSorted(arr)) {
         for (int i = 0; i < arr.length; i++) {
            int r = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
         }
      }
   }

   private static boolean isSorted(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] >= arr[i - 1]) {
         } else {
            return false;
         }
      }
      return true;
   }
}


