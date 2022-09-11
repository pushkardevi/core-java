package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Demo12 {

    public static void main(String[] args) {


        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Heeyy"));
    }
//
//    @Override
//    public String get() {
//        return "Hello";
//    }
}
