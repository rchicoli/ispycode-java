import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.NameBasedGenerator;
import java.util.UUID;

public class Example {

   public static void main(String args[]) {

      // create a time based UUID
      NameBasedGenerator generator = Generators.nameBasedGenerator();
      UUID uuid = generator.generate("myname");
      System.out.println(uuid.toString());
   }   
}


