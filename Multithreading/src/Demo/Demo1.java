package Demo;

public class Demo1 {

    private static class A extends Thread {

        public synchronized void m1() throws InterruptedException {
            Thread.sleep(5000);
            System.out.println("Hello");
        }
    }


    public static void main(String[] args) throws InterruptedException {

        A a1 = new A();
        A a2 = new A();
        a1.m1();
        a2.m1();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        //t1.start();
        //t2.start();
    }
}
