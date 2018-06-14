
import java.util.Arrays;

public class Example {

   public static void main(String[] args) {

      String[] array = new String[5];

      // fill each element in the array with a specific value
      Arrays.fill(array,"Hello");

      for (int i=0; i < array.length; i++) {
         System.out.println("array[" + i + "]: " + array[i]);
      }
   }
}


