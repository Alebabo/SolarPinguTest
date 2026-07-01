import java.util.HashMap;
import java.util.Map;

public class InventoryService implements L02Hard.Inventory {
        Map<String,Integer> stock = new HashMap<>(Map.of("book", 2));

        public boolean reserve(String item){
            if (!stock.containsKey(item) || stock.get(item) <= 0) return false;
            stock.put(item, stock.get(item) - 1);
            return true;
        }

        public void add(String item){
            stock.putIfAbsent(item, stock.get(item) +1);
        }

        public int getPrice(String item){
            return stock.getOrDefault(stock.get(item), 0);
        }
    }
