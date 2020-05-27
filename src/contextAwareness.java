import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import static java.lang.Integer.parseInt;

public class contextAwareness {

    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL_TEMP_LOCATION = "http://localhost/temperatures/{location}";

    private static final String GET_URL_TEMP = "http://localhost/temperatures/current";

    private static final String GET_URL_HUM_LOCATION = "http://localhost/humidities/{location}";

    private static final String GET_URL_HUM = "http://localhost/humidities/current";

    private static final String GET_URL_USER_LOCATION = "http://localhost/locations/current";

    private static final String API_IP = "127.0.0.1";

    private static final String API_PORT = "80";

    public String localizacao;

    public static String GetUserLocation() throws IOException {

        URL obj = new URL(GET_URL_USER_LOCATION);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // return the temperature
            return response.toString();

        } else {
            System.out.println("Erro no get Temperature");
            return null;
        }
    }


    public static int GetTemp(String location) throws IOException {
        URL obj = new URL(GET_URL_TEMP_LOCATION);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // return the temperature
            return parseInt(response.toString());

        } else {
            System.out.println("Erro no get Temperature Location");
            return -99;
        }
    }
    public static int GetTemp() throws IOException {
        URL obj = new URL(GET_URL_TEMP);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // return the temperature
            return parseInt(response.toString());

        } else {
            System.out.println("Erro no get Temperature");
            return -99;
        }
    }

    public static int GetHumidity(String location) throws IOException {
        URL obj = new URL(GET_URL_HUM_LOCATION);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
    
            // return the temperature
            return parseInt(response.toString());

        } else {
            System.out.println("Erro no get Humidity Location");
            return -99;
        }

    }
    public static int GetHumidity() throws IOException {
        URL obj = new URL(GET_URL_HUM);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // return the temperature
            return parseInt(response.toString());

        } else {
            System.out.println("Erro no get Humidity");
            return -99;
        }
    }

    public void SetUserLocation(String location){
            this.localizacao = location;
    }

}
