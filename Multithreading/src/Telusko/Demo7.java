package Telusko;

public class Demo7 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("T1");
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("T2");
            }

        });

        Thread t3 = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("T3");
            }

        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
