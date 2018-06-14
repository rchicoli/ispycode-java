import java.util.*;

public class Example {

   public static void main(String[] args) {

      int[] arr = {99, 77, 55, 33, 11, 88, 66, 44, 22};
      System.out.println("Unsorted: " + Arrays.toString(arr));

      shellSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }

   public static void shellSort(int[] arr) {
      int inner, outer;
      int temp;

      int h = 1;
      while (h <= arr.length / 3) {
         h = h * 3 + 1;
      }
      while (h > 0) {
         for (outer = h; outer < arr.length; outer++) {
            temp = arr[outer];
            inner = outer;

            while (inner > h - 1 && arr[inner - h] >= temp) {
               arr[inner] = arr[inner - h];
               inner -= h;
            }
            arr[inner] = temp;
         }
         h = (h - 1) / 3;
      }
   }  
}


