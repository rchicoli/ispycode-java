
import java.util.Arrays;

public class Example {

   public static void main(String[] args) {

      int[] odd = { 1,3,5,7,9 };
      int[] even = { 2,4,6,8,10 };

      // Create a new array for the combined values
      int[] merge = new int[odd.length + even.length];

      // copy the odd values
      System.arraycopy(odd, 0, merge, 0, odd.length);

      // copy the even values
      System.arraycopy(even, 0, merge, even.length, even.length);

      // print the merged array
      System.out.println(Arrays.toString(merge));
   }
}


