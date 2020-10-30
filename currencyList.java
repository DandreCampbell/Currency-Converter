import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/*
String[] currency = {"Mexican Pesos", "Euros", "Jamaican Dollar", "Japaense", "Chinese Yuan",
                    "Swiss Franc"};
*/
public class currencyList extends JFrame
{
  private final int WIDTH = 500;
  private final int LENGTH = 500;
  private final Font font = new Font("Times New Roman", Font.BOLD, 14);
  private JLabel usLabel = new JLabel("USD Price: ");
  private JTextField usText = new JTextField("", 20);
  private JLabel foreignLabel = new JLabel("Exchange Rate: ");
  private JTextField foreignText = new JTextField("", 20);
  private JButton enterButton;
  private JList<String> cList;
  private JScrollPane scroll;

  public currencyList() {
    currencyGUI();
    theList();
    butt();
  }

  public void currencyGUI() {
    setTitle("Currency Converter");
    setSize(WIDTH, LENGTH);

    usText.setEditable(true);
    usText.setFont(font);
    foreignText.setEditable(false);
    foreignText.setFont(font);

    theList();
    butt();

    pack();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

  public void theList() {
     String[] currency = {"Mexican Pesos", "Euros", "Jamaican Dollar", "Japaense", "Chinese Yuan",
                         "Swiss Franc"};
     DefaultListModel<String> currencyNames = new DefaultListModel<>();

     // Adds List of Different Currency to a JList
     for(int i = 0; i < currency.length; i++) {
       currencyNames.addElement(currency[i]);
     }

     cList = new JList<>(currencyNames);
     cList.setSelectedIndex(0);
     cList.setVisibleRowCount(3);
     //cList().setBounds();

     //Scroll Feature
     scroll = new JScrollPane(cList);
   }

   public void butt() {
     enterButton = new JButton("Enter");
     //enterButton.addActionListener(Enter);
   }

   /*
   Action Enter = new AbstractAction() {
     public void actionPerformed(ActionEvent e) {

       String str = String.format("%.2f", );
     }
   }
   */

   public static void main(String[] args) {
     new currencyList();
   }
}
