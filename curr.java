import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class curr {
    public static void main(String[] args) {
        try {
            String fromCurrency = "USD";
            String toCurrency = "EUR";
            double amount = 100.0;

            String url = "https://api.exchangerate-api.com/v4/latest/" + fromCurrency;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            double exchangeRate = Double.parseDouble(response.toString().split("\"" + toCurrency + "\":")[1].split(",")[0]);
            double convertedAmount = amount * exchangeRate;

            System.out.printf("%.2f %s is equal to %.2f %s", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
