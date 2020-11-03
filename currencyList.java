import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class currencyList extends JPanel
{
  private JPanel panel;
  private JFrame frame;

  private final int WIDTH = 500;
  private final int LENGTH = 500;

  private final Font font = new Font("Times New Roman", Font.BOLD, 14);

  private JLabel usLabel;
  private JTextField usText;

  private JLabel foreignLabel;
  private JTextField foreignText;

  private JList<String> cList;
  private JScrollPane scroll;
  private JButton enterButton;

  public currencyList() {
    mainFrame();
    mainPanel();
  }

  public void mainFrame() {
    frame = new JFrame();
    frame.setTitle("Currency Converter");
    frame.setSize(WIDTH, LENGTH);
    //frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void mainPanel() {
    panel = new JPanel(new GridLayout());

    usLabel = new JLabel("USD Price: ");
    usText = new JTextField("", 20);
    usText.setFont(font);
    usText.setEditable(true);
    panel.add(usLabel);
    panel.add(usText);

    foreignLabel = new JLabel("Exchange Rate: ");
    foreignText = new JTextField("", 20);
    foreignText.setFont(font);
    foreignText.setEditable(false);
    panel.add(foreignLabel);
    panel.add(foreignText);

    enterButton = new JButton("Enter");
    panel.add(enterButton);
    //enterButton.addActionListener(Enter);



  }

  /*
  Action Enter = new AbstractAction() {
    public void actionPerformed(ActionEvent e) {

      String str = String.format("%.2f", );
    }
  }
  */

  public void theList() {
    DefaultListModel<String> currencyNames = new DefaultListModel<String>();
    String[] currency = {"Mexican Pesos", "Euros", "Jamaican Dollar", "Japaense", "Chinese Yuan",
                         "Swiss Franc"};

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

   public static void main(String[] args) {
     new currencyList();
   }
}
