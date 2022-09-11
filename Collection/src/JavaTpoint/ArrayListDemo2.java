package JavaTpoint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {


    private static class Student{
        private int rollno;
        private String name;
        private int age;
        Student(int rollno,String name,int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Steve",10));
        list.add(new Student(2,"Roger",20));
        list.add(new Student(3,"Tony",15));
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list.isEmpty());
        System.out.println(list.size());

    }
}
