package JavaTpoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(al);
            fileOutputStream.close();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("file");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<String> arrayList = (ArrayList<String>) objectInputStream.readObject();
            System.out.println(arrayList);
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
