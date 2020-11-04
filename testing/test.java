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

public class test
{
    // Setting URL
  String url_str = "https://v6.exchangerate-api.com/v6/2b1becc2b080c6a17e5854fd/latest/USD";

  // Making Request
  URL url = new URL(url_str);
  HttpURLConnection request = (HttpURLConnection) url.openConnection();
  request.connect();

  // Convert to JSON
  JsonParser jp = new JsonParser();
  JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
  JsonObject jsonobj = root.getAsJsonObject();

  // Accessing object
  String req_result = jsonobj.get("result").getAsString();
}
