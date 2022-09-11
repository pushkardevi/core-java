package StreamAPI;

import java.util.Comparator;

public class Demo6 {

    public static void main(String[] args) {

        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println(comparator.compare(100,20));

        Comparator<Integer> c2 = (Integer::compareTo);
        System.out.println(c2.compare(10,10));
    }
}
