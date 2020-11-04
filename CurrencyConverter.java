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

    System.out.println("\nEnter The Number:");
    double input = sc.nextDouble();

    if(input == 1) {
      System.out.println("\nUSD to Euros");
    }
    else if(input == 2) {
      System.out.println("\nUSD to Japanese Yen");
    }
    else if(input == 3) {
      System.out.println("\nUSD to British Pound");
    }
    else if(input == 4) {
      System.out.println("\nUSD to to Austrailian Dollar");
    }
    else if(input == 5) {
      System.out.println("\nUSD to Canadian Dollar");
    }
    else if(input == 6) {
      System.out.println("\nUSD to to Swiss Franc");
    }
    else {
      System.out.println("\nNot a valid input. Rerun Program...");
      System.exit(0);
    }

    System.out.println("Enter The Amount:");
    double amount = sc.nextDouble();

    /**

    */
    System.out.println("\nAmount in (selected currency):");
    System.out.printf("%.2f\n", conversionAPI(amount));
    /**

    */
  }

  public double conversionAPI(double userAmount) {
     double finalAmount = 0;
    /**
    Code for connecting to API and making final Calculations
    */
    return finalAmount;
  }

  public static void main(String[] args) {
    new CurrencyConverter();
  }
}
