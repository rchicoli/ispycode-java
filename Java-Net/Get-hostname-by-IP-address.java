import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example {

   public static void main(String[] args) throws UnknownHostException {

      InetAddress addr = InetAddress.getByName("173.194.206.147");      
      String host = addr.getHostName();
      System.out.println(host);
   }

}


