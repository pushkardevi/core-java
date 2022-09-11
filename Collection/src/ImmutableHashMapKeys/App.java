package ImmutableHashMapKeys;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("Pushkar");
        map.put(s1,"India");



        //s1.setName("Sam");
        System.out.println(map.get(s1));


    }
}
