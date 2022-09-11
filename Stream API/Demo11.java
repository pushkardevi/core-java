package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo11 {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 4, 8, 6, 7, 8, 9};
        int num = 44;
        findPairOfDiff(arr, num);
    }

    private static void findPairOfDiff(int[] arr, int num) {
        int j;
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            j = i + 1;
            if (arr[j] - arr[i] == num) {
                found = true;
                System.out.println(i + "," + j);
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
