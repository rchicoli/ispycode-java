import java.util.Properties;

public class Example {

   public static void main(String[] args) {

      Properties props = System.getProperties();

      props.setProperty("favorite.fruit", "apple");

      String fruit = System.getProperty("favorite.fruit");
      System.out.println("favorite.fruit: " + fruit);

      props.setProperty("favorite.fruit", "plum");

      fruit = System.getProperty("favorite.fruit");
      System.out.println("favorite.fruit: " + fruit);

   }
}


