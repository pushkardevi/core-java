package Java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServiceImpl {

    public List<Book> getBooks() {

        List<Book> list = new BookDao().getBooks();
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return list;
    }

    public static void main(String[] args) {
        BookServiceImpl impl = new BookServiceImpl();
        for (Book b : impl.getBooks()) {
            System.out.println(b.getId() + " ," + b.getName() + " ," + b.getPages());
        }

        impl.getBooks().stream().filter(b -> b.getId() % 2 == 0).forEach(System.out::println);
        //impl.getBooks().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}

//class MyComparator implements Comparator<Book> {
//
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}