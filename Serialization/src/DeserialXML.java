import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserialXML {

    public static void main(String[] args) throws FileNotFoundException {

        XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("Myxml.xml")));

        College c = (College) x.readObject();
        List<Student> s = c.getStudents();
        for (Student value : s) {
            System.out.println(value);
        }

    }
}
