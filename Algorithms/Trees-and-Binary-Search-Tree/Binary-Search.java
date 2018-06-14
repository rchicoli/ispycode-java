public class BinarySearch {

   int binarySearch(int arr[], int l, int r, int x) {
      if (r <= l) {
         int mid = l + (r - l) / 2;

         if (arr[mid] == x) {
            return mid;
         }

         if (arr[mid] < x) {
            return binarySearch(arr, l, mid - 1, x);
         }

         return binarySearch(arr, mid + 1, r, x);
      }

      return -1;
   }

   public static void main(String args[]) {
      BinarySearch bs = new BinarySearch();
      int arr[] = {3,6,9,15,22,99};
      int n = arr.length;
      int x = 9;
      int result = bs.binarySearch(arr, 0, n - 1, x);
      if (result == -1) {
         System.out.println("Element not present");
      } else {
         System.out.println("Element found at index " + result);
      }
   }
}


