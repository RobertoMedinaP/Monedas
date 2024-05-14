import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu= new Menu();
        menu.mostrarMenu();
    }
}

    /*public static void main(String[] args)throws IOException, InterruptedException  {
        String moneda1="EUR";
        String moneda2="CLP";
        int conversion;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        String direccion="https://v6.exchangerate-api.com/v6/e7345ee89e1a311373fadf5d/pair/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //moneda 1 y moneda 2 seran puestas desde el menu
                .uri(URI.create(direccion+moneda1+"/"+moneda2))
                .build();


        HttpResponse<String> response;
                response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json= response.body();
        System.out.println(json);
*/

      /*Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese el monto:");
        double monto = Double.parseDouble(sc.nextLine());

        System.out.println("Ingrese la moneda de origen:");
        String moneda1 = sc.nextLine();

        System.out.println("Ingrese la moneda de destino:");
        String moneda2 = sc.nextLine();

        double tasaDeCambio = Apiconexion.obtenerTasaDeCambio(moneda1, moneda2, monto);
        double montoConvertido = monto * tasaDeCambio;

        System.out.println("La tasa de cambio es: " + tasaDeCambio);
        System.out.println("El monto convertido es: " + montoConvertido);*/


