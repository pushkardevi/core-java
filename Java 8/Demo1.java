package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> s = list.stream();


        s.forEach(System.out::println);

        //s.forEach(System.out::println);  // Exception
    }
}
