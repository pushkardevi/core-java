import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialXML {

    public static void main(String[] args) throws FileNotFoundException {

        Student s1 = new Student();
        s1.setName("A");
        s1.setRollNo(1);

        Student s2 = new Student();
        s1.setName("B");
        s1.setRollNo(2);

        Student s3 = new Student();
        s1.setName("C");
        s1.setRollNo(3);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        College c1 = new College();
        c1.setStudents(list);


        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Myxml.xml")));
        x.writeObject(c1);

    }
}
