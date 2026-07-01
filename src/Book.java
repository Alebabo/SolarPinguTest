import java.util.List;
import java.util.function.Consumer;

public class Book {
    private String name;
    private int pageCount;
    private String Author;
    private double price;

    public Book(String name, int pageCount, String author) {
        this.name = name;
        this.pageCount = pageCount;
        Author = author;
        price = 67;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }
}
