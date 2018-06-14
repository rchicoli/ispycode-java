import java.awt.*;
import javax.swing.*;
import java.util.*;

class Clock extends JFrame implements Runnable {

   Thread runner;
   Font clockFont;

   public Clock() {
      super("Java Digital Clock");
      setSize(350, 50);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setResizable(false);

      clockFont = new Font("Serif", Font.BOLD, 42);

      Container contentArea = getContentPane();
      ClockPanel timeDisplay = new ClockPanel();

      contentArea.add(timeDisplay);
      setContentPane(contentArea);
      start();
   }

   class ClockPanel extends JPanel {

      public void paintComponent(Graphics painter) {
         painter.setFont(clockFont);
         painter.setColor(Color.black);
         painter.drawString(timeNow(), 60, 40);
      }
   }

   public String timeNow() {
      Calendar now = Calendar.getInstance();
      int hrs = now.get(Calendar.HOUR_OF_DAY);
      int min = now.get(Calendar.MINUTE);
      int sec = now.get(Calendar.SECOND);
      String time = zero(hrs) + ":" + zero(min) + ":" + zero(sec);
      return time;
   }

   public String zero(int num) {
      String number = (num < 10) ? ("0" + num) : ("" + num);
      return number;
   }

   public void start() {
      if (runner == null) {
         runner = new Thread(this);
      }
      runner.start();
   }

   public void run() {
      while (runner == Thread.currentThread()) {
         repaint();
         try {
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
         }
      }
   }

   public static void main(String[] args) {
      Clock eg = new Clock();
   }
}


