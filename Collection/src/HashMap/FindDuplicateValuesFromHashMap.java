package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateValuesFromHashMap {

    public static void main(String[] args) {

// Map<String, String> map = new HashMap<>();
//		map.put("A", "1");
//		map.put("B", "1");
//		map.put("C", "2");
//		map.put("D", "5");
//		map.put("E", "5");


//Set<String> set = new HashSet<>();
//List<String> list = new ArrayList<>();
//
//		for (Entry<String, String> entry : map.entrySet()) {
//
//			if (!set.add(entry.getValue())) {
//				list.add(entry.getValue());
//			} else {
//				set.add(entry.getValue());
//			}
//
//		}
//		list.forEach(System.out::println);

		Map<String, String> map = Map.of("A", "1", "B", "1", "C", "2", "D", "5", "E", "5");
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();

		map.forEach((k, v) -> {

            if (!set.add(v)) {
                list.add(v);
            } else {
                set.add(v);
            }
        });
		list.forEach(System.out::println);
    }

}
