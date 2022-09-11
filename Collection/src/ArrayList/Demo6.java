package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo6 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            list.add("Hey " + i);
        }
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
