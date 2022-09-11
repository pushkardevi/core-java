package StreamAPI;

import java.util.function.Function;

public class Demo9 {


    static Function<String,String> function = name -> name.toUpperCase();

    public static void main(String[] args) {

        System.out.println(function.apply("Java"));

    }

}
