package StreamAPI;

import java.util.Arrays;

public class SecondLargestInArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 3, 8, 4};
        Arrays.sort(arr);
        int second = arr[arr.length - 2];
        System.out.println(second);
    }
}
