import java.util.List;
import java.util.Observer;
import java.util.function.Consumer;

public class CustomerView {
    Consumer<List<String>> consumers = new Consumer<List<String>>() {
        @Override
        public void accept(List<String> stringList) {
            stringList.forEach(b -> System.out.println("accepted " + b));
        }
    };
}
