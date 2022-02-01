import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ApiTest {

    public static void main(String args[]) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .header("key1", "value1")
                .header("key2", "value2")
                .timeout(Duration.of(10, ChronoUnit.SECONDS))
                .POST(HttpRequest.BodyPublishers.ofString("Sample request body"))
                .build();

        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response: " + response.headers());

//        HttpRequest request2 = HttpRequest.newBuilder()
//                .uri(new URI("https://postman-echo.com/post"))
//                .POST(HttpRequest.BodyPublishers.noBody())
//                .build();
    }
}
