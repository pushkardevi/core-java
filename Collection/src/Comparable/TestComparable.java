package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(23,"Mahesh",55));
		list.add(new Student(24,"Sonu",57));
		list.add(new Student(25,"Monu",23));
		list.add(new Student(26,"Ronu",17));

		Collections.sort(list);

		list.forEach(System.out::println);
	}

}
