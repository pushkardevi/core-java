package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Sam", "Peter", "Ben", "Steve");

        List<String> unique = new ArrayList<>();
        for (String name : list) {
            if (!unique.contains(name)) {
                unique.add(name);
            }
        }
        System.out.println(unique);

        List<String> uniqueList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueList);
    }
}
