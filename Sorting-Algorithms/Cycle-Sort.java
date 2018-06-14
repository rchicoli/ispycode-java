import java.util.*;

public class Example {

   public static void main(String[] args) {

      int[] arr = {99, 77, 55, 33, 11, 88, 66, 44, 22};
      System.out.println("Unsorted: " + Arrays.toString(arr));

      cycleSort(arr);
      System.out.println("Sorted  : " + Arrays.toString(arr));
   }

   public static void cycleSort(int[] input) {

      for (int cs = 0, seeker, pos; cs < input.length - 1; cs++) {

         //assume the element at input[cs] is out of place
         seeker = input[cs];
         pos = cs;
         //find the correct position (pos) of seeker
         for (int i = cs + 1; i < input.length; i++) {
            if (input[i] < seeker) {
               pos++;
            }
         }
         //if seeker is already in correct position, move on
         if (pos == cs) {
            continue;
         }
         //move index pos after duplicates if any
         while (seeker == input[pos]) {
            pos++;
         }

         seeker = set(input, seeker, pos);

         while (pos != cs) {
            //same as block of code above
            pos = cs;
            for (int i = cs + 1; i < input.length; i++) {
               if (input[i] < seeker) {
                  pos++;
               }
            }
            while (seeker == input[pos]) {
               pos++;
            }
            seeker = set(input, seeker, pos);
         }
      }
   }

   private static int set(int[] array, int data, int ndx) {
      try {
         return array[ndx];
      } finally {
         array[ndx] = data;
      }
   }

}


