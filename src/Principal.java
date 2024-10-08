import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime; // Importación de LocalDateTime
import java.time.format.DateTimeFormatter; // Importación de DateTimeFormatter
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner menu = new Scanner(System.in);
        while (true) {

            System.out.println("********************************************************");
            System.out.println("Conversor de Moneda");
            System.out.println("\n1- Dólar a Peso Argentino ");
            System.out.println("2- Peso Argentino a Dólar");
            System.out.println("3- Dólar a Real Brasileño");
            System.out.println("4- Real Brasileño a Dólar");
            System.out.println("5- Dólar a Peso Colombiano");
            System.out.println("6- Peso Colombiano a Dólar");
            System.out.println("7- Dólar a Peso Chileno");
            System.out.println("8- Peso Chileno a Dólar");
            System.out.println("9- Dólar a Peso Mexicano");
            System.out.println("10- Peso Mexicano a Dólar");
            System.out.println("11- Salir");
            System.out.println("\nElija una opción");
            System.out.println("*******************************************************");

            int opcion = menu.nextInt();
            if (opcion == 11) {
                System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                break;
            }

            String divisas = "";

            switch (opcion) {
                case 1 -> divisas = "USD/ARS";
                case 2 -> divisas = "ARS/USD";
                case 3 -> divisas = "USD/BRL";
                case 4 -> divisas = "BRL/USD";
                case 5 -> divisas = "USD/COP";
                case 6 -> divisas = "COP/USD";
                case 7 -> divisas = "USD/CLP";
                case 8 -> divisas = "CLP/USD";
                case 9 -> divisas = "USD/MXN";
                case 10 -> divisas = "MXN/USD";
                default -> {
                    System.out.println("Opción no válida");
                    return;
                }
            }

            Scanner convertir = new Scanner(System.in);
            System.out.println("Indique un monto: ");
            double monto = convertir.nextDouble();

            // Registrar fecha y hora de la conversión
            LocalDateTime fechaHora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fechaFormateada = fechaHora.format(formatter);
            System.out.println("Registro de la conversión realizada el: " + fechaFormateada);

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a589c0e18fefde50d44f9988/pair/" + divisas + "/" + monto);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            Datos datos = gson.fromJson(json, Datos.class);
            DatosPrincipales misDatos = new DatosPrincipales(datos);
            System.out.println("El monto ingresado de: " + " " + monto + " " + misDatos);
        }
    }
}
