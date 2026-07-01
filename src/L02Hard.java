import java.util.*;
import java.util.function.Consumer;

public class L02Hard {
    // Ausgangslage: Monolith
    static class ShopMonolith {
        Map<String, Integer> stock = new HashMap<>(Map.of("book", 2));

        String order(String item, double price) {
            if (!stock.containsKey(item) || stock.get(item) <= 0) return "out of stock";
            stock.put(item, stock.get(item) - 1);
            System.out.println("charged " + price);
            System.out.println("email: order confirmed for " + item);
            return "ok";
        }
    }

    interface Inventory {
        boolean reserve(String item);
    }

    interface Payment {
        void charge(double amount);
    }

    interface Notifier {
        void confirm(String item);
    }

    // TODO: InventoryService implements Inventory (Bestand pruefen + senken)
    // TODO: PaymentService implements Payment
    // TODO: NotificationService implements Notifier
    // TODO: OrderCoordinator nutzt die drei Services in order(...)

    public static void main(String[] args) {
        Ordercordinator ordercordinator = new Ordercordinator();
        for (int i = 0; i < 3; i++) {
            ordercordinator.bookBook("book");
        }
    }
}



