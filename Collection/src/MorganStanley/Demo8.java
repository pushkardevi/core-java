package MorganStanley;

public class Demo8 implements Runnable{

    public static Demo8 obj;
    private int data;
    public Demo8(){
        data = 10;
    }


    @Override
    public void run() {
        obj = new Demo8();
        try {
            obj.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj.data = obj.data + 20;
        System.out.println(obj.data);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Demo8());
        //Thread t2 = new Thread();
        t1.start();
        System.out.println("DRM - ");
    }
}
