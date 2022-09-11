package JavaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOf {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
                //Arrays.asList("Ravi", "Roshan", "Kaka","Ranga");
        List<String> copy = List.copyOf(list);
        doNotChange(copy);
        System.out.println(copy);
    }

    private static void doNotChange(List<String> list) {

        list.add("NotAllowed");


    }


}
