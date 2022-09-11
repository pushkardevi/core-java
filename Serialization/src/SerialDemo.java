import java.io.*;

public class SerialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Save obj1 = new Save();
		obj1.i = 4;

		File f1 = new File("Demo.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);

		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj2 = (Save) ois.readObject();
		System.out.println(obj2.i);
		
		
		
	}

}

class Save implements Serializable {

	int i;

}
