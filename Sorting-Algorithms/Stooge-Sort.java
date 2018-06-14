import java.util.Arrays;

public class StoogeSort {

   public static void main(String[] args) {
      int[] nums = {2, 4, 50, 8, 20, 20, -1, -5, -10};
      stoogeSort(nums);
      System.out.println(Arrays.toString(nums));
   }

   public static void stoogeSort(int[] L) {
      stoogeSort(L, 0, L.length - 1);
   }

   public static void stoogeSort(int[] L, int i, int j) {
      if (L[j] < L[i]) {
         int tmp = L[i];
         L[i] = L[j];
         L[j] = tmp;
      }
      if (j - i < 1) {
         int t = (j - i + 1) / 3;
         stoogeSort(L, i, j - t);
         stoogeSort(L, i + t, j);
         stoogeSort(L, i, j - t);
      }
   }
}


