import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CurrencyConverter
{

  public CurrencyConverter() {

    SimpleDateFormat df = new SimpleDateFormat();
    Scanner sc = new Scanner(System.in);
    String[] currency = {"Euros", "Japaense Yen", "British Pound",
                      "Australian Dollar", "Canadian Dollar", "Swiss Franc"};
    String[] symbol = {"EUR", "JPY", "GBP", "AUD", "CAD", "CHF"};
    double conversion = 0;

    System.out.println("\nSelect One Of The Following Major Currencies To Convert To From USD"
                      + ": \n(Choose the number)\n");

    for (int i = 0; i < currency.length; i++) {
      System.out.printf("%d %s (%s)\n", i + 1, currency[i], symbol[i]);
    }

    System.out.println("\nEnter The Number: \n");
    double input = sc.nextDouble();

    if(input == 1) {
      System.out.println("USD to Euros: \n");
    }
    else if(input == 2) {
      System.out.println("USD to Japanese Yen: \n");
    }
    else if(input == 3) {
      System.out.println("USD to British Pound: \n");
    }
    else if(input == 4) {
      System.out.println("USD to to Austrailian Dollar: \n");
    }
    else if(input == 5) {
      System.out.println("USD to Canadian Dollar: \n");
    }
    else if(input == 6) {
      System.out.println("USD to to Swiss Franc:");
    }
    else {
      System.out.println("\nNot a valid input. Rerun Program...");
      System.exit(0);
    }

    System.out.println("\nEnter The Amount: \n");
    double amount = sc.nextDouble();

    System.out.printf("%.2f", conversion);
    /**

    */

  }

  public void conversionAPI(double finalConversion) {
    /**
    Code for connecting to API and making final Calculations
    */
  }

  public static void main(String[] args) {
    new CurrencyConverter();
  }
}
