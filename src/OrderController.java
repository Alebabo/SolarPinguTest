import java.awt.*;
import java.util.ArrayList;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class OrderController {
    private WebClient webClient;
    private ArrayList<String> orders;
    public OrderController() {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader(HttpHeaders.ACCEPT, PageAttributes.MediaType.APPLICATION_JSON_VALUE )
                .defaultHeader(HttpHeaders.CONTENT_TYPE, PageAttributes.MediaType.APPLICATION_JSON_VALUE)
                .build();
        this.orders = new ArrayList<>();
    }
}
