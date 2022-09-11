package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //System.out.println(list.stream().map(i -> i *2).reduce(0,(c,e) -> c+e));


        //Stream<Integer> stream = list.stream();

        /*Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };*/

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        //Stream<Integer> s1 = stream.map(integer -> integer * 2);
        //int result = list.stream().map(integer -> integer * 2).reduce(0, ((integer, integer2) -> integer+integer2);
        int result = list.stream().map(integer -> integer * 2).reduce(0, Integer::sum);
        System.out.println(result);
    }

}
