import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

//import com.google.gson.JsonElement;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
    //System.out.printf("%.2f\n", conversionAPI(amount));
    /**

    */
  }

  public double conversionAPI(String symbol, double userAmount) {
    //URL apiURL;
    //HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
    double finalAmount = 0;
    symbol = "";

    //Code for connecting to API and making final Calculations

    return finalAmount;
  }

  public static void connectionTest() {
    try {
      // https://v6.exchangerate-api.com/v6/2b1becc2b080c6a17e5854fd/latest/USD
      URL apiURL = new URL("https://api.exchangeratesapi.io/latest?base=USD");
      HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();

      connection.setRequestMethod("GET");
      connection.setConnectTimeout(5000);
      connection.setReadTimeout(5000);

      int status = connection.getResponseCode();
      System.out.println(status);

      BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String inputLine;
      StringBuffer sb = new StringBuffer();

      while ((inputLine = br.readLine()) != null) {
        sb.append(inputLine);
      }
      br.close();

      String sbString = sb.toString();
      System.out.println(sbString);

      /**
      JSONObject object = new JSONObject(sbString);
      System.out.println(object.getJsonString("AED")); //AED
      */
      connection.disconnect();
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    //new CurrencyConverter();
    connectionTest();
  }
}
