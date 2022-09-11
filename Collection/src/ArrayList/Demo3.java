package ArrayList;

import java.util.*;

public class Demo3 {


    private static class Student {

        private String firstName;

        Student(String firstName){
            this.firstName = firstName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Pushkar");
        Student s2 = new Student("Amit");
        Student s3 = new Student("Samar");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.sort(Comparator.comparing(o -> o.firstName));
        list.forEach(System.out::print);
    }
}
