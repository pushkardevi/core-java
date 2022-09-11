package MorganStanley;

public class Demo2 {

    public static void main(String[] args) {

        System.out.println(method());

    }

    private static Object method() {
        try {
            int i = 10 / 0;
            return i;

        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            return "finally";
        }
    }
}
