import java.util.Arrays;
import java.util.List;

public class Example {

   public static void main(String[] args) {

      List<Integer> ints = Arrays.asList( 1, 2, 3, 4, 5 );
      List<Double> doubles = Arrays.asList( 1.1, 2.2, 3.3 );
      System.out.println(sum(ints));
      System.out.println(sum(doubles));   
   }

   public static double sum(List<? extends Number> list) {
      double sum = 0.0;
      for (Number n : list) {
         sum += n.doubleValue();
      }
      return sum;
   }
}


