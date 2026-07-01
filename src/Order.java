import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private ArrayList<Book> books;
    private LocalDate date;
    public Order(ArrayList<Book> books) {
        this.books = books;
        date = LocalDate.now();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public LocalDate getDate() {
        return date;
    }
}
