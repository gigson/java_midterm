package ge.btu.giorgi.kusikashvili.weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class WeatherBotService {

    public static String answer(String command) {
        if (command.equals("all")) {
            return getWeather(null);
        }

        return getWeather(command);
    }


    public static String getWeather(String city) {
        try {
            String uri = "http://localhost:8080/giorgi_kusikashvili_davaleba_1_war_exploded/api/weather";
            if (city != null) {
                uri += "/" + city;
            }

            URL url = new URL(uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output = br.lines().collect(Collectors.joining());

            conn.disconnect();
            return output;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Error";
    }

}
