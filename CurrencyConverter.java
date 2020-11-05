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


    System.out.println("Enter The Amount:");
    double amount = sc.nextDouble();

    if(input == 1) {
      System.out.println("\nConverting USD to Euros...\n"
                        + "Amount in Euros: ");
                        //System.out.printf("%.2f\n", conversionAPI(amount));
    }
    else if(input == 2) {
      System.out.println("\nConverting USD to Japanese Yen...\n"
                        + "Amount in Yen: ");
    }
    else if(input == 3) {
      System.out.println("\nConverting USD to British Pound...\n"
                        + "Amount in British Pounds: ");
    }
    else if(input == 4) {
      System.out.println("\nConverting USD to to Austrailian Dollar...\n"
                        + "Amount in Austrailian Dollar: ");
    }
    else if(input == 5) {
      System.out.println("\nConverting USD to Canadian Dollar...\n"
                        + "Amount in Canadian Dollar: ");
    }
    else if(input == 6) {
      System.out.println("\nConverting USD to to Swiss Franc...\n"
                        + "Amount in Swiss Francs: ");
    }
    else {
      System.out.println("\nNot a valid input. Rerun Program...");
      System.exit(0);
    }
  }

  public double conversionAPI(String symbol, double userAmount) throws IOException, MalformedURLException {
    double finalAmount = 0;
    symbol = "";
    int status;
    String apiURL = "https://api.exchangeratesapi.io/latest?base=USD";
    URL url = new URL(apiURL);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    connection.setRequestMethod("GET");
    //connection.setConnectTimeout(5000);
    //connection.setReadTimeout(5000);
    status = connection.getResponseCode();
    System.out.println(status);

    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String inputLine;
    StringBuffer sb = new StringBuffer();

    while ((inputLine = br.readLine()) != null) {
      sb.append(inputLine);
    }
    br.close();
    System.out.println(sb.toString());

    /**
    JSONObject object = new JSONObject(sbString);
    System.out.println(object.getJsonString("AED")); //AED
    */

    connection.disconnect();

    return finalAmount;
  }

  public static void main(String[] args) {
    new CurrencyConverter();
  }
}
