import java.util.List;
import java.util.Observer;
import java.util.function.Consumer;

public class CustomerView {
    Consumer<List<Book>> consumers = new Consumer<List<Book>>() {
        @Override
        public void accept(List<Book> stringList) {
            stringList.forEach(b -> System.out.println("accepted " + b.getName()));
        }
    };
}
