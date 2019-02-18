/**
 * Made by D'Andre Campbell
 */
import javax.swing.*;

public class CurrencyConverter
{
  public static void main(String[] args)  {
    Currency conversion = new Currency();
    String input;
    String con1, con2, con3, con4, con5, con6;
    double num1, num2, num3, num4, num5, num6;

    String[] choices = {"US to Jamaican Dollars", "US to Euros", "US to Pesos",
      "US to Yen", "US to Yuan", "US to Swiss Franc"};

    // Creates a dialog box with a drop down list of choices
    input = (String) JOptionPane.showInputDialog(null, "Which conversion would you like",
                                                 "Currency Converter",
                                                 JOptionPane.QUESTION_MESSAGE,
                                                 null, choices, choices[0]);
    // Runs if US to Jamaica is chosen
    if(input == choices[0]) {
      con1 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num1 = Double.parseDouble(con1);
      conversion.UStoJam(num1);
      JOptionPane.showMessageDialog(null, String.format("%.2f", conversion.getJam()), "U.S. to Jamaica", JOptionPane.PLAIN_MESSAGE);
      //JOptionPane.showMessageDialog(null, conversion.getJam());
    }

    // Runs if US to Euros is chosen
    else if(input == choices[1])  {
      con2 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num2 = Double.parseDouble(con2);
      conversion.UStoEuro(num2);
      JOptionPane.showMessageDialog(null, String.format("%.2f", conversion.getEuros()), "U.S. to Euros", JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Pesos is chosen
    else if(input == choices[2])  {
      con3 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num3 = Double.parseDouble(con3);
      conversion.UStoMexico(num3);
      JOptionPane.showMessageDialog(null, String.format("%.2f", conversion.getPesos()), "U.S. to Pesos", JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Japan is chosen
    else if(input == choices[3])  {
      con4 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num4 = Double.parseDouble(con4);
      conversion.UStoJapan(num4);
      JOptionPane.showMessageDialog(null, String.format("%.2f", conversion.getYen()), "U.S. to Japanese Yen", JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to China is chosen
    else if(input == choices[4])  {
      con5 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num5 = Double.parseDouble(con5);
      conversion.UStoChina(num5);
      JOptionPane.showMessageDialog(null, String.format("%.2f", conversion.getYuan()), "U.S. to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Swiss is chosen
    else if(input == choices[5])  {
      con6 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num6 = Double.parseDouble(con6);
      conversion.UStoSwiss(num6);
      JOptionPane.showMessageDialog(null, String.format("%.2f", conversion.getFranc()), "U.S. to Swiss Franc", JOptionPane.PLAIN_MESSAGE);
    }

    System.exit(0);
  }
}
