package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo10 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream()
                .filter(odd -> odd % 2 != 0)
                .map(odd -> odd * odd).reduce(Integer::sum).ifPresent(System.out::println);

    }
}
