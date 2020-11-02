import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CurrencyConverter
{
  public CurrencyConverter() {

    Scanner sc = new Scanner(System.in);
    String input;
    String[] currency = {"Euros (EUR)", "Japaense Yen (JPY)", "British Pound (GBP)",
                      "Australian Dollar (AUD)", "Canadian Dollar (CAD)", "Swiss Franc (CHF)"};

    System.out.println("Select One Of The Following Major Currencies: ");

    for (int i = 0; i < currency.length; i++) {
      System.out.printf("%.2f %s", i + 1, currency[i]);
    }
  }
  
  public static void main(String[] args) {
    new CurrencyConverter();
  }
}
