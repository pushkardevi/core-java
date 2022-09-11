package JavaTpoint;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

    private static final class Person {

        String name;
        List<String> degrees;

        public Person(String name, List<String> degrees) {
            this.name = name;
            this.degrees = degrees;
        }
    }

    /*private static class Student extends Person {    // Can't extend immutable class as this class is final

        String age;
    }*/

    public static void main(String[] args) {

        String s1 = "BE";
        List<String> list = new ArrayList<>();
        list.add(s1);

        Person p1 = new Person("Pushkar", list);
        System.out.println(p1.name + " ," + p1.degrees);


    }


}
