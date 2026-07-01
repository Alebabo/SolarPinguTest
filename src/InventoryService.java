import java.util.HashMap;
import java.util.Map;

public class InventoryService implements L02Hard.Inventory {
        Map<Book,Integer> stock = new HashMap<>(Map.of(new Book("book", 67, "Ale"), 2));

        public boolean reserve(Book item){
            if (!stock.containsKey(item) || stock.get(item) <= 0) return false;
            stock.put(item, stock.get(item) - 1);
            return true;
        }

        public void add(Book item){
            stock.putIfAbsent(item, stock.get(item) +1);
        }
        public void makeoutofStock(Book item){
            if(item == null || !stock.containsKey(item)) return;
            stock.put(item, 0);
        }

        public int getPrice(Book item){
            return stock.getOrDefault(item, 0);
        }
    }
