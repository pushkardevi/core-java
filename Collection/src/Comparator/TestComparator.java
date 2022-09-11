package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(400);
        list.add(300);
        list.add(150);
        list.add(350);

        Collections.sort(list,(o1,o2) ->{

            return o1%10>o2%10 ? 1:-1;
        });
        list.forEach(System.out::println);


    }
}