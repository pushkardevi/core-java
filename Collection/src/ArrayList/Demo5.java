package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo5 {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();


        for (int i = 0; i <= 5000; i++) {
            list.add("Hello " + i);
        }

        for (String s : list) {

            System.out.println(s);
            list.add("Hello");
        }
    }

}
