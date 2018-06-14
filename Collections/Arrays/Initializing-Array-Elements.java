import java.util.Arrays;

public class Example {

   public static void main(String[] args) {

      //Declaring an array of ints
      int[] myInts;

      //Instantiate the array of int using new operator
      myInts = new int[10];

      //Initializing 3rd element
      myInts[2] = 33;

      //Initializing 6th element
      myInts[5] = 66;

      // easy way to print contebnts
      System.out.println(Arrays.toString(myInts));

   }
}


