import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class CustomerClient {
    private WebClient webClient;
    private ArrayList<Order> orders;
    Consumer<List<Order>> consumers = new Consumer<List<Order>>() {
        @Override
        public void accept(List<Order> stringList) {
            stringList.forEach(b -> System.out.println("accepted " + b.getDate()));
        }
    };

    public CustomerClient() {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE )
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
        orders = new ArrayList<>();
    }

    public void updatePerson(ArrayList<Book> book, int orderID) {
        webClient.put()
                .uri("customers/" + orderID)
                .bodyValue(book)
                .retrieve()
                .bodyToMono(Book [].class)
                .map(Arrays::asList)
                .onErrorStop()
                .subscribe(book1 -> {
                    Optional<Order> order = orders.stream().filter(x-> x.getId() == orderID).findFirst();

                    if(order.isEmpty()){
                        return;
                    }
                    order.get().getBooks().addAll(book1);
                    consumers.accept(orders);
                });
    }

}
