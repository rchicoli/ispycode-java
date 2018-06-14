public class Example {

   public static void main(String[] args) {

      // declare an array
      int[] arr;

      // initialize array
      arr = new int[10];

      // populate
      for (int i = 0; i < arr.length; ++i) {
         arr[i] = i;
      }

      for (int i : arr){
         System.out.println(arr[i]);
      }

   }
}


