/*
Jam
Euros
Pesos
Yen
Yuan
Franc
*/
import java.swing.*;
import java.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/*
String[] currency = {"Mexican Pesos", "Euros", "Jamaican Dollar", "Japaense", "Chinese Yuan",
                    "Swiss Franc"};
*/
public class currencyList
{
  private JFrame window = new JFrame();
  private final int WIDTH = 500;
  private final int LENGTH = 500;
  private final Font font = new Font("Times New Roman", Font.BOLD, 14);
  private JLabel usLabel = new JLabel("USD Price: ");
  private JTextField usText = new JTextField("", 20);
  private JLabel foreignLabel = new JLabel("Exchange Rate: ");
  private JTextField foreignText = new JTextField("", 20);
  private JButton enterButton;

  public currencyList() {
    window.setTitle("Currency Converter");
    window.setSize(WIDTH, LENGTH);

    usText.setEditable(true);
    usText.setFont(font);
    foreignText.setEditable(false);
    foreignText.setFont(font);

    window.pack();
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void butt() {
     enterButton = new JButton("Enter");
     enterButton.addActionListener(Enter);
   }

   Action Enter = new AbstractAction() {
     public void actionPerformed(ActionEvent e) {

       String str = String.format("%.2f", );
     }
   }

   public static void main(String[] args) {
     new currencyList();
   }
}
