package Demo;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo4 {

    private static int count;
    //AtomicInteger count = new AtomicInteger();

    public static void counter() {
        count++;
    }


    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }

}
