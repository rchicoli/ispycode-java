import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ChannelShellExample {

   static public void main(String[] args) throws JSchException, IOException, InterruptedException {

      java.util.Properties config = new java.util.Properties();
      config.put("StrictHostKeyChecking", "no");

      JSch jsch = new JSch();
      Session session = jsch.getSession("dennis", "localhost", 22);
      session.setConfig(config);
      session.setPassword("mypasswd");

      session.connect();

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

      ChannelShell channel = (ChannelShell) session.openChannel("shell");
      channel.setOutputStream(outputStream);
      PrintStream stream = new PrintStream(channel.getOutputStream());
      channel.connect();

      stream.println("cd /etc/java");
      stream.flush();
      waitForPrompt(outputStream);

      stream.println("pwd");
      stream.flush();
      waitForPrompt(outputStream);

      stream.println("ls");
      stream.flush();
      waitForPrompt(outputStream);

      channel.disconnect();
      session.disconnect();

   }

   static public void waitForPrompt(ByteArrayOutputStream outputStream) throws InterruptedException {
      int retries = 5;
      for (int x = 1; x < retries; x++) {
         Thread.sleep(1000);
         if (outputStream.toString().indexOf("$") < 0) {
            System.out.print(outputStream.toString());
            outputStream.reset();
            return;
         }
      }
   }
}


