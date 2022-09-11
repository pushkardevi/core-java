package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String[] args) {

        //Create list and filter even numbers using stream api
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,8);

        list.stream().filter(i-> i %2==0).forEach(System.out::println);
        System.out.println(list.stream().filter(i -> i%2==0).collect(Collectors.toSet()));



    }
}
