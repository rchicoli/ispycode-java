import java.util.*;

public class Example {

   public static void main(String[] args) {
      int[] arr = {99, 77, 55, 33, 11, 88, 66, 44, 22};
      System.out.println("Unsorted: " + Arrays.toString(arr));

      cocktailSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }

   public static void cocktailSort(int[] arr) {
      boolean swapped;
      do {
         swapped = false;
         for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
               int temp = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = temp;
               swapped = true;
            }
         }
         if (!swapped) {
            break;
         }
         swapped = false;
         for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
               int temp = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = temp;
               swapped = true;
            }
         }
      } while (swapped);
   }
}


