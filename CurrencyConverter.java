/**
 * Made by D'Andre Campbell
 */
import javax.swing.*;

public class newConverter
{
  private double jam;   // Holds conversion of US to Jamaican currensy
  private double euros; // Holds conversion of US to European currensy
  private double pesos; // Holds conversion of US to Mexican currensy
  private double yen;   // Holds conversion of US to Japanese currensy
  private double yuan;  // Holds conversion of US to Chinese currensy
  private double franc; // Holds conversion of US to Swiss Franc

  public newConverter() {
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
      UStoJam(num1);
      JOptionPane.showMessageDialog(null, String.format("%.2f", getJam()), "U.S. to Jamaica",
                                                JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Euros is chosen
    else if(input == choices[1]) {
      con2 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num2 = Double.parseDouble(con2);
      UStoEuro(num2);
      JOptionPane.showMessageDialog(null, String.format("%.2f", getEuros()), "U.S. to Euros",
                                                JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Pesos is chosen
    else if(input == choices[2]) {
      con3 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num3 = Double.parseDouble(con3);
      UStoMexico(num3);
      JOptionPane.showMessageDialog(null, String.format("%.2f", getPesos()), "U.S. to Pesos",
                                                JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Japan is chosen
    else if(input == choices[3]) {
      con4 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num4 = Double.parseDouble(con4);
      UStoJapan(num4);
      JOptionPane.showMessageDialog(null, String.format("%.2f", getYen()), "U.S. to Japanese Yen",
                                                JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to China is chosen
    else if(input == choices[4]) {
      con5 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num5 = Double.parseDouble(con5);
      UStoChina(num5);
      JOptionPane.showMessageDialog(null, String.format("%.2f", getYuan()), "U.S. to Chinese Yuan",
                                                JOptionPane.PLAIN_MESSAGE);
    }

    // Runs if US to Swiss is chosen
    else if(input == choices[5]) {
      con6 = JOptionPane.showInputDialog(null, "Enter amount you would like to convert");
      num6 = Double.parseDouble(con6);
      UStoSwiss(num6);
      JOptionPane.showMessageDialog(null, String.format("%.2f", getFranc()), "U.S. to Swiss Franc",
                                                JOptionPane.PLAIN_MESSAGE);
    }

    System.exit(0);
  }

  /**
   * Converts US dollar to Jamaican dollar
   */
  public void UStoJam(double money) {
    money *= 126.82;
    jam = money;
  }

  /**
   * Returns value of jam
   */
  public double getJam()  {
    return jam;
  }

  /**
   * Converts US dollar to European dollar
   */
  public void UStoEuro(double money)  {
    money *= .9;
    euros = money;
  }

  /**
   * Returns value of euros
   */
  public double getEuros()  {
    return euros;
  }

  /**
   * Converts US dollar to Japanese dollar
   */
  public void UStoJapan(double money) {
    money *= 101.57;
    yen = money;
  }

  /**
   * Returns value of yen
   */
  public double getYen()  {
    return yen;
  }

  /**
   * Converts US dollar to Chinese dollar
   */
  public void UStoChina(double money) {
    money *= 6.68;
    yuan = money;
  }

  /**
   * Returns value of yuan
   */
  public double getYuan() {
    return yuan;
  }

  /**
   * Converts US dollar to Mexican dollar
   */
  public void UStoMexico(double money)  {
    money *= 18.74;
    pesos = money;
  }

  /**
   * Returns value of pesos
   */
  public double getPesos()  {
    return pesos;
  }

  /**
   * Converts US dollar to Swiss Franc
   */
  public void UStoSwiss(double money) {
    money *=  1;
    franc = money;
  }

  /**
   * Returns value of franc
   */
  public double getFranc() {
    return franc;
  }

  public static void main(String[] args) {
    new newConverter();
  }
}
