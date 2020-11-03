import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

import com.google.gson.JsonElement;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class APItest
{
  private static HttpURLConnection connection;

  public static void main(String[] args) {
    try {
      URL url = new URL("https://v6.exchangerate-api.com/v6/2b1becc2b080c6a17e5854fd/latest/USD");
      connection = (HttpURLConnection) url.openConnection();

      connection.setRequestMethod("GET");
      connection.setConnectTimeout(5000);
      connection.setReadTimeout(5000);

      int status = connection.getResponseCode();
      System.out.println(status);

      JSONParser jp = new JSONParser();
      JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
      JSONObject jsonobj = root.getAsJsonObject();

      String req_request = jsonobj.get("result").getAsString();
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    finally {
      connection.disconnect();
    }
  }


}
