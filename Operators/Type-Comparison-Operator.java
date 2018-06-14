
interface Car {}
class Honda implements Car {}
class Civic extends Honda {}

public class InstanceofComparison {
   public static void main(String[] args) {

      Honda honda = new Honda();
      Civic civic= new Civic();

      System.out.println(honda instanceof Civic);
      System.out.println(honda instanceof Car);
      System.out.println(civic instanceof Car);
   }
}


