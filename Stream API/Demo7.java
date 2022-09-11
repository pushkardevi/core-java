package StreamAPI;

import java.util.List;
import java.util.function.Consumer;

public class Demo7 {

    static Consumer<Person> c1 = System.out::println;

    static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());

    static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
    static List<Person> list = Person.getAllPersons();

    private static void printNameAndHobbies(){

        list.forEach(c1.andThen(c2));
    }

    private static void printWithCondition(){
        list.forEach(p-> {
            if(p.getName().equals("M") && p.getHeight() >= 101){
                c2.andThen(c3).accept(p);
            }
        });
    }

    public static void main(String[] args) {

        //List<Person> personList = Person.getAllPersons();
//        c1.accept(Person.getPerson());
//        c2.accept(Person.getPerson());
//        c3.accept(Person.getPerson());
        //c1.andThen(c2).andThen(c3).accept(Person.getPerson());
        printNameAndHobbies();
        printWithCondition();
    }
}
