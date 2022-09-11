package StreamAPI;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo8 {

    public static void main(String[] args) {

        Predicate<Integer> lesThan = a -> (a >= 50);
        boolean result = lesThan.test(55);
        System.out.println(result);

    }
}
