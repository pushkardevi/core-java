package StreamAPI;

import java.util.List;
import java.util.function.Supplier;

public class Demo15 {

	public static void main(String[] args) {

		// List<Person> list = Person.getAllPersons();

		Supplier<Person> s = () -> Person.getPerson();
		System.out.println(s.get());
	}
}
