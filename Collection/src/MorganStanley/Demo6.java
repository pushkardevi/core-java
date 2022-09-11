package MorganStanley;

public abstract class Demo6 {

    public String recipient;
    public abstract void send();

    public static void main(String[] args) {

        Demo6 demo6 = new Child();
        demo6.recipient = "123";
        demo6.send();

    }

    private static class Child extends Demo6{

        @Override
        public void send() {
            System.out.println("Test "+recipient);
        }
    }
}

