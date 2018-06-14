import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.IOException;
import java.io.InputStream;

public class ChannelExecExample {

   static public void main(String[] args) throws JSchException, IOException, InterruptedException {

      java.util.Properties config = new java.util.Properties();
      config.put("StrictHostKeyChecking", "no");

      JSch jsch = new JSch();
      Session session = jsch.getSession("dennis", "localhost", 22);
      session.setConfig(config);
      session.setPassword("mypasswd");

      session.connect();

      ChannelExec ce = (ChannelExec) session.openChannel("exec");
      ce.setCommand("uptime");

      InputStream in = ce.getInputStream();
      ce.connect();
      byte[] tmp = new byte[1024];
      while (true) {
         while (in.available() > 0) {
            int i = in.read(tmp, 0, 1024);
            if (i < 0) {
               break;
            }
            System.out.print(new String(tmp, 0, i));
         }
         if (ce.isClosed()) {
            break;
         }
         Thread.sleep(1000);

      }

      ce.disconnect();      
      session.disconnect();
   }
}


