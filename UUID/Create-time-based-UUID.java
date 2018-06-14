import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.NoArgGenerator;
import java.util.Date;
import java.util.UUID;

public class Example {

   public static void main(String args[]) {

      // create a time based UUID
      NoArgGenerator timeBasedGenerator = Generators.timeBasedGenerator();
      UUID uuid = timeBasedGenerator.generate();
      System.out.println(uuid.toString());

      // get time UUID was created
      long time = getTimeFromUUID(uuid);
      Date date = new Date(time);
      System.out.println(date);
   }

   public static long getTimeFromUUID(UUID uuid) {

      long NUM_100NS_INTERVALS_SINCE_UUID_EPOCH = 0x01b21dd213814000L;
      return (uuid.timestamp() - NUM_100NS_INTERVALS_SINCE_UUID_EPOCH) / 10000;
   }

}


