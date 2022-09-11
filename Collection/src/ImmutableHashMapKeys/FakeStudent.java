package ImmutableHashMapKeys;


import java.util.Objects;

//Mutable
public class FakeStudent { //extends Student

    private String fakeStudentName;


    public FakeStudent(String name) {
        //super(name);
        this.fakeStudentName = name;
    }

//    @Override
//    public String getName() {
//        return fakeStudentName;
//    }

    public void setFakeStudentName(String fakeStudentName) {
        this.fakeStudentName = fakeStudentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FakeStudent that = (FakeStudent) o;
        return Objects.equals(fakeStudentName, that.fakeStudentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fakeStudentName);
    }
}
