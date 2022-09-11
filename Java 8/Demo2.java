package Java8;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

        //List<Integer> list = Arrays.asList(1, 3, 4, 6, 7);
        List<Integer> list = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        //List<Integer> list = Arrays.asList(6,88,99);

        //*********Filter********
        System.out.println(list.stream().
                filter(i -> i % 5 == 0).
                map(i -> i * 2).
                reduce(0, Integer::sum));

        // First values divisible by 5
        System.out.println(list.stream().
                filter(i -> i % 5 == 0).
                map(i -> i * 2).
                findFirst().orElse(0));


        //int result = 0;

        /*for (int i : list) {

            result = result + i * 2;
        }*/

        //**************Map Reduce**************
        //System.out.println(list.stream().map(i -> i * 2).reduce(0,Integer::sum));


    }


}
