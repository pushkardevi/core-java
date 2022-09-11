package ArrayList;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		Demo4 demo = new Demo4();
		demo.run();
	}

	void run() {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= 5000; i++) {
			list.add("Student " + i);
		}
		System.out.println(new Timestamp(System.currentTimeMillis()));
		list.remove("Student 4000");
		System.out.println(new Timestamp(System.currentTimeMillis()));

	
		System.out.println();
		List<String> list2 = new LinkedList<>();
		for (int i = 1; i <= 5000; i++) {
			list2.add("Student " + i);
		}
		System.out.println(new Timestamp(System.currentTimeMillis()));
		list2.remove("Student 4000");
		System.out.println(new Timestamp(System.currentTimeMillis()));
	}
}
