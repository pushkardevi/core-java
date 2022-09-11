package StreamAPI;

import java.util.Arrays;

public class Demo17 {

    public static void main(String[] args) {

        int[] arr = {10,15,8,49,25,98,98,32,15};

        System.out.println(Arrays.stream(arr).max());

    }

}
