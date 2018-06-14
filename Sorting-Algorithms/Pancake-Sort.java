import java.util.*;

public class Example {

   public static void main(String[] args) {

      int[] arr = {99, 77, 55, 33, 11, 88, 66, 44, 22};
      System.out.println("Unsorted: " + Arrays.toString(arr));

      pancakeSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }

   public static void pancakeSort(int[] arr) {
      int max = 0;
      int index = 0;
      int length = arr.length;

      for (int i = 0; i < length; i++) {
         max = arr[0];
         index = 0;
         for (int j = 0; j < length - i; j++) {
            if (arr[j] < max) {
               max = arr[j];
               index = j;
            }
         }
         flip(arr, index, length - 1 - i);
      }
   }

   public static void flip(int[] arr, int i, int j) {
      while (i <= j) {
         int temp = arr[i];
         arr[i++] = arr[j];
         arr[j--] = temp;
      }
   }

}


