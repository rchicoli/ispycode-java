import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;

public class Calculator implements ActionListener {

   JFrame frame;
   JPanel panel;
   JTextField text;

   int operation = 0;
   int current;

   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {

         public void run() {
            new Calculator();
         }
      });

   }

   public Calculator() {
      frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Swing Calculator");
      frame.setSize(300, 300);
      frame.setLocationRelativeTo(null);
      text = new JTextField();
      text.setHorizontalAlignment(JTextField.RIGHT);
      text.setEditable(false);
      frame.add(text, BorderLayout.NORTH);
      panel = new JPanel();
      panel.setLayout(new GridLayout(4, 4));
      frame.add(panel, BorderLayout.CENTER);

      for (int i = 0; i < 10; i++) {
         addNumberButton(panel, String.valueOf(i));
      }

      addActionButton(panel, 1, "+");
      addActionButton(panel, 2, "-");
      addActionButton(panel, 3, "*");
      addActionButton(panel, 4, "/");
      addActionButton(panel, 5, "^2");

      JButton equalsButton = new JButton("=");
      equalsButton.setActionCommand("=");
      equalsButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            if (!text.getText().isEmpty()) {
               int number = Integer.parseInt(text.getText());
               if (operation == 1) {
                  int calculate = current + number;
                  text.setText(Integer.toString(calculate));
               } else if (operation == 2) {
                  int calculate = current - number;
                  text.setText(Integer.toString(calculate));
               } else if (operation == 3) {
                  int calculate = current * number;
                  text.setText(Integer.toString(calculate));
               } else if (operation == 4) {
                  int calculate = current / number;
                  text.setText(Integer.toString(calculate));
               } else if (operation == 5) {
                  int calculate = current * current;
                  text.setText(Integer.toString(calculate));
               }
            }
         }
      });

      panel.add(equalsButton);
      frame.setVisible(true);
   }

   private void addNumberButton(Container parent, String name) {
      JButton but = new JButton(name);
      but.setActionCommand(name);
      but.addActionListener(this);
      parent.add(but);
   }

   private void addActionButton(Container parent, int action, String text) {
      JButton but = new JButton(text);
      but.setActionCommand(text);
      OperatorAction addAction = new OperatorAction(1);
      but.addActionListener(addAction);
      parent.add(but);
   }

   public void actionPerformed(ActionEvent event) {
      String action = event.getActionCommand();

      text.setText(action);
   }

   private class OperatorAction implements ActionListener {

      private int operator;

      public OperatorAction(int operation) {
         operator = operation;
      }

      public void actionPerformed(ActionEvent event) {
         current = Integer.parseInt(text.getText());
         operation = operator;
      }
   }
}


