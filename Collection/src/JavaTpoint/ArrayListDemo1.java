package JavaTpoint;

import java.util.*;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Berry");
        list.add("Orange");
        list.add("Grapes");
        System.out.println(list);

        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(list.get(1));
        list.set(1,"Chiku");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
