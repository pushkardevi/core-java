package Demo;

public class Demo2 {

    public static void main(String[] args) {

        Parent p = new Child();
        p.walk();
        p.run();

    }


    private static class Parent {

        void walk() {
            System.out.println("Walk");
        }

        void run() {
            System.out.println("Run");
        }
    }

    private static class Child extends Parent {

        @Override
        void walk() {
            super.walk();
        }

        @Override
        void run() {
            super.run();
        }
    }


}
