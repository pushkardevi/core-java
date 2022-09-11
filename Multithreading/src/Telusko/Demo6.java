package Telusko;

public class Demo6 {

    public static void main(String[] args) {

        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

    }


    private static class Q {
        int num;
        boolean isValueSet = false;

        private synchronized void setValue(int num) {

            while (isValueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Set : " + num);
            this.num = num;
            isValueSet = true;
            notify();
        }

        private synchronized void getValue() {

            while (!isValueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Get : " + num);
            isValueSet = false;
            notify();
        }

    }

    private static class Producer implements Runnable {

        Q q;

        public Producer(Q q) {
            this.q = q;
            Thread t1 = new Thread(this, "Producer");
            t1.start();
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                q.setValue(i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    private static class Consumer implements Runnable {
        Q q;

        Consumer(Q q) {
            this.q = q;
            Thread t1 = new Thread(this, "Consumer");
            t1.start();
        }

        @Override
        public void run() {
            while (true) {
                q.getValue();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
