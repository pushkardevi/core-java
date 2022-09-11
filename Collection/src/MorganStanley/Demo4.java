package MorganStanley;

public class Demo4 {

    public static void main(String[] args) {
        Test<String> first  = new Test<>("a string");
        Test<Integer> second = new Test<>(123);
        System.out.println(first.getValue());
        System.out.println(second.getValue());
    }
}

class Test<T> {

    T value;

    public Test(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
