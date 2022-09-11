package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "Pushkar");
        map.put("2", "Saket");
        map.put("3", "Sam");
        map.put("4", "Jamy");
        map.put("5", "Rose");
        map.put("6", "Meery");
        map.put("7", "Rit");
        map.put("8", "Pon");
        map.put("9", "Derry");

        Map<String, String> tree = new TreeMap<>();

        tree.put("1", "Pushkar");
        tree.put("2", "Saket");
        tree.put("3", "Sam");
        tree.put("4", "Jamy");
        tree.put("5", "Rose");
        tree.put("6", "Meery");
        tree.put("7", "Rit");
        tree.put("8", "Pol");
        tree.put("9", "Derry");


        map.forEach((k, v) -> System.out.print(k + "-->" + v + " "));
        System.out.println();
        tree.forEach((k, v) -> System.out.print(k + "-->" + v + " "));
    }
}
