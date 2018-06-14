
import java.util.Arrays;

public class Example {

   public static void main(String[] args) {

      Integer []arr = {2,4,6,8,6};

      // test if array contains a value
      boolean b = Arrays.asList(arr).contains(2);
      System.out.println(b);

      // get first index of a value
      int index = Arrays.binarySearch(arr,6);
      System.out.println(index);         
  }
}


