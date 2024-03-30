import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
//import org.asynchttpclient.*;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;


// Método que llama a una Api de meteorología "Foreca Weather".
// El código es el proporcionado por "rapid api".
// Código de donostia 103110044


public class ConsultarTiempo {

    public void elTiempo(boolean asistencia) throws IOException, InterruptedException {       

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://foreca-weather.p.rapidapi.com/current/103110044?alt=0&tempunit=C&windunit=KMH&tz=Europe%2FLondon&lang=es"))
                .header("X-RapidAPI-Key", "de18d567b2msh186ecfa25392b63p17c74cjsn90f941c5789d")
                .header("X-RapidAPI-Host", "foreca-weather.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        // Recibimos la info en formato json, lo guardamos en el String "miJson"
        String miJson = response.body();

        // Convertimos el string Json en Objecto
        JSONObject jsonObject = new JSONObject(miJson);

        // Accedemos a "current"

        JSONObject current = jsonObject.getJSONObject("current");

        // Variables para tratar los datos que me interesan

        String pronostico = current.getString("symbolPhrase");
        int temperatura = current.getInt("temperature");
        int sensacionTermica = current.getInt("feelsLikeTemp");
        int humedad = current.getInt("relHumidity");
        int velocidadViento = current.getInt("windSpeed");

        String cadena = "\n\nPronóstico del día en Donosti: " + pronostico + "\nTemperatura: " + temperatura +
                " grados. \nSensación térmica: " + sensacionTermica + " grados. \nHumedad: " + humedad +
                " por ciento. \nVelocidad Viento: " + velocidadViento + " kilómetros hora";

        if (!asistencia) {
            System.out.println(cadena);
        } else {
            Asistente asistente = new Asistente();
            asistente.habla(cadena);
        }
    }
}