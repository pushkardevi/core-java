package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private int height;
    private String salary;
    private String gender;
    private int kids;
    private List<String> hobbies = new ArrayList<>();

    public Person(String name, int height, String salary, String gender, int kids, List<String> hobbies) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.gender = gender;
        this.kids = kids;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", salary='" + salary + '\'' +
                ", gender='" + gender + '\'' +
                ", kids=" + kids +
                ", hobbies=" + hobbies +
                '}';
    }

    public static List<Person> getAllPersons() {
        Person p1 = new Person("John", 100, "1000", "M", 1, List.of("Cricket,Swimming"));
        Person p2 = new Person("Ben", 101, "2000", "M", 2, List.of("Football,Tennis"));
        Person p3 = new Person("Dean", 102, "3000", "M", 3, List.of("Chess,Running"));
        Person p4 = new Person("Lio", 103, "4000", "F", 4, List.of("Carrom,Table"));
        return Arrays.asList(p1, p2, p3, p4);
    }

    public static Person getPerson() {
        return new Person("Rose", 120, "5000", "F", 1, List.of("Swimming,Cricket,Football"));
    }
}

