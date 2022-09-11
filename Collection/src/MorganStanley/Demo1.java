package MorganStanley;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {

    public static void main(String[] args) {

        Comparator<Integer> comparator = (num1, num2) -> num2.compareTo(num1);
        Integer[] arr = {1, 4, 3, 2};
        Arrays.sort(arr, comparator);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
