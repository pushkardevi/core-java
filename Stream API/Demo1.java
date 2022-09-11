package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //Consumer<Integer> consumer = System.out::println;
        list.forEach(Demo1::doubleIt);

    }

    private static void doubleIt(int i) {
        System.out.println(i *2);
    }

}
