package ArrayList;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 77, 77, 33, 32, 5);

        Collections.sort(list, Collections.reverseOrder());

        Set<Integer> set1 = new TreeSet<>(list);
        Set<Integer> set2 = new LinkedHashSet<>(list);


        System.out.println(set1);
        System.out.println(set2);

    }


}
