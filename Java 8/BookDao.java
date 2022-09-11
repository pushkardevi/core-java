package Java8;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks() {

        List<Book> list = new ArrayList<>();
        list.add(new Book(1, "Book1", 5));
        list.add(new Book(2, "Book2", 10));
        list.add(new Book(3, "Book3", 15));
        return list;

    }

}
