/**
 * Made by D'Andre Campbell
 */

public class Currency
{
  private double jam;   // Holds conversion of US to Jamaican currensy
  private double euros; // Holds conversion of US to European currensy
  private double pesos; // Holds conversion of US to Mexican currensy
  private double yen;   // Holds conversion of US to Japanese currensy
  private double yuan;  // Holds conversion of US to Chinese currensy
  private double franc; // Holds conversion of US to Swiss Franc
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
}
