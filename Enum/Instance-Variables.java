enum SIZE {
   SMALL(10),
   MEDIUM(20),
   LARGE(30);

   private final int weight;

   SIZE(int weight) {
      this.weight = weight;
   }

   public int weight() {
      return weight;
   }
}

public class Example {

   public static void main(String[] args) {

      System.out.println(SIZE.LARGE.weight());
   }
}


