import java.util.Arrays;

public class Example {

   public static void main(String[] args) {
      int[] arr = {9,7,5,3,1,0,2,4,6,8};
      System.out.println("Unsorted: " + Arrays.toString(arr));
      bubbleSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }

   public static void bubbleSort(int arr[]) {
      int len = arr.length;
      for (int i = len; i >= 0; i--) {
         for (int j = 0; j < len - 1; j++) {
            int k = j + 1;
            if (arr[j] > arr[k]) {
               swapNumbers(j, k, arr);
            }
         }
      }
   }

   private static void swapNumbers(int i, int j, int[] arr) {
      int temp;
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}


