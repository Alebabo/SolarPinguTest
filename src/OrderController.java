import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrderController {
    private ArrayList<Order> orders;
    private Ordercordinator ordercordinator;
    public OrderController() {
        this.orders = new ArrayList<>();
        ordercordinator = new Ordercordinator();
    }

    @PutMapping("orders/{orderid}")
    public void addBook(@RequestBody ArrayList<Book> book, @PathVariable int orderid){
        Optional<Order> order = orders.stream().filter(x-> x.getId() == orderid).findFirst();

        if(order.isEmpty()){
            return;
        }
       order.get().getBooks().addAll(book);
    }

    @PostMapping("orders")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        if(!orders.contains(order)){
            orders.add(order);
            return ResponseEntity.ok(order);
        }
        return ResponseEntity.badRequest().build();
    }


}
