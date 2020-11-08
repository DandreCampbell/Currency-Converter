import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import com.google.gson.JsonElement;

import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// https://www.exchangerate-api.com/docs/java-currency-api
// https://api.exchangeratesapi.io/latest?base=USD

public class apiTest
{

  public static void main(String[] args) throws IOException, MalformedURLException, ParseException{
      //URL url = new URL("https://v6.exchangerate-api.com/v6/2b1becc2b080c6a17e5854fd/latest/USD");
      URL url = new URL("https://api.exchangeratesapi.io/latest?base=USD");
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      connection.setRequestMethod("GET");
      //connection.setConnectTimeout(5000);
      //connection.setReadTimeout(5000);

      int status = connection.getResponseCode();
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
      JSONParser parser = new JSONParser();
      JSONObject object = (JSONObject) parser.parse(sb.toString());
      JSONObject object = new JSONObject("rate").getJSONObject("EUR");
      System.out.println(object.getJsonNumber("AED")); //AED
      System.out.println(object.getJsonString("base"));
      */
      Gson gson = new Gson();
      gson.fromJson(sb.toString());

      connection.disconnect();
  }


}
