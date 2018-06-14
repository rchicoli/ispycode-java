import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

public class Clock {

   public static void main(String[] args) {
      JFrame clock = new TextClockWindow();
      clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      clock.setVisible(true);
   }
}

class TextClockWindow extends JFrame {

   private JTextField timeField;

   public TextClockWindow() {

      timeField = new JTextField(6);
      timeField.setFont(new Font("Times", Font.PLAIN, 48));

      Container content = this.getContentPane();
      content.setLayout(new FlowLayout());
      content.add(timeField);

      this.setTitle("Text Clock");
      this.pack();

      Timer t = new Timer(1000, (ActionEvent e) -< {
         Calendar now = Calendar.getInstance();
         int h = now.get(Calendar.HOUR_OF_DAY);
         int m = now.get(Calendar.MINUTE);
         int s = now.get(Calendar.SECOND);
         timeField.setText("" + h + ":" + m + ":" + s);
      });
      t.start();
   }
}


