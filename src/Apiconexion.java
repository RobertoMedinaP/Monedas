import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Apiconexion {

    private static final String API_KEY = "e7345ee89e1a311373fadf5d";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public static double obtenerTasaDeCambio(String moneda1, String moneda2, double monto) throws IOException, InterruptedException {
        String url = API_URL + API_KEY + "/pair/" + moneda1 + "/" + moneda2 + "/" + monto;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        ApiResponse apiResponse = gson.fromJson(json, ApiResponse.class);


        if ("success".equals(apiResponse.getResult())) {

            return apiResponse.getConversionRate();
        } else {

            throw new IOException("Error en la solicitud: " + apiResponse.getResult());
        }
    }

    private static class ApiResponse {
        private String result;
        private double conversion_rate;

        public String getResult() {
            return result;
        }

        public double getConversionRate() {
            return conversion_rate;
        }
    }
}

