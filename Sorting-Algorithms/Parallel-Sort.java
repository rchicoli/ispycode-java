import java.util.*;

public class Example {

   public static void main(String[] args) {

      int[] arr = {99, 77, 55, 33, 11, 88, 66, 44, 22};
      System.out.println("Unsorted: " + Arrays.toString(arr));

      Arrays.parallelSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }  
}


