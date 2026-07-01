import java.awt.*;
import java.net.http.HttpHeaders;
import java.util.ArrayList;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import de.tum.in.ase.eist.model.Character;
import de.tum.in.ase.eist.util.CharacterCreationRequest;

public class OrderController {
    private WebClient webClient;
    private List<String> order;
    public OrderController() {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader(HttpHeaders.ACCEPT, PageAttributes.MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, PageAttributes.MediaType.APPLICATION_JSON_VALUE)
                .build();
        this.orders = new ArrayList<>();
    }
}
