package Telusko;

public class Demo4 {


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }, "Hello Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        t2.start();


        System.out.println(t1.isAlive());
        //Hey Main thread wait
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }

}
