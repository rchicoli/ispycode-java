public class Example {

   public static void main(String[] args) {

      Thing <String> thing1 = new Thing<String>();
      thing1.addName("A String");
      System.out.println(thing1.getName());

      Thing <Integer> thing2 = new Thing<Integer>();
      thing2.addName(100);
      System.out.println(thing2.getName());
   }
}

class Thing<T> {

   private T t;

   public void addName(T t) {
      this.t = t;
   }

   public T getName() {
      return t;
   }
}


