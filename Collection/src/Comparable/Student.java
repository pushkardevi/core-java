package Comparable;

public class Student implements Comparable<Student> {

    int rollNo, marks;
    String name;

    public Student(int rollNo, String name,int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return marks > o.marks ? 1 : -1;
    }
}
