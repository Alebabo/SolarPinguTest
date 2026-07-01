import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private ArrayList<Book> books;
    private LocalDate date;
    private static int counter = 1;
    private int id;
    public Order(ArrayList<Book> books) {
        this.books = books;
        date = LocalDate.now();
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public LocalDate getDate() {
        return date;
    }
}
