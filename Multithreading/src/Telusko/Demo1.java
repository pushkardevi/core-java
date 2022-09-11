package Telusko;

public class Demo1 {


    public static void main(String[] args) {

        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();

    }

    private static class Hi extends Thread {
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    private static class Hello extends Thread {

        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
