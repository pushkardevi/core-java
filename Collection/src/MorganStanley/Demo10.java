package MorganStanley;

public class Demo10 {

    public static void main(String[] args) {

        Labrador c = new Labrador();
        printValue(c);

    }

    static void printValue(Animal a) {

        System.out.println("ONE");
    }

    static void printValue(Dog b) {

        System.out.println("TWO");

    }

    static void printValue(Object obj) {

        System.out.println("THREE");

    }
}

class Animal {

}

class Dog extends Animal {

}

class Labrador extends Dog {

}
