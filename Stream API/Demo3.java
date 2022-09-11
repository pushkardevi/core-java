package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        //int result = 0;
        /*for (int i : list) {
            if (i % 5 == 0) {
                result = result + i;
            }
        }*/
        System.out.println(list.stream()
                .filter(i -> i % 5 ==0)
                .map(integer -> integer *2)
                //.findFirst()
                .reduce(0,Integer::sum));

    }
}
