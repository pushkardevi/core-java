package ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap extends Thread {
    //static HashMap<Integer, Integer> cm = new HashMap<>();
    static ConcurrentHashMap<Integer, Integer> cm = new ConcurrentHashMap<>();
    @Override
    public void run() {
        try {


            for (int i = 10; i <= 20; i++) {

                Thread.sleep(1000);
                cm.put(i, i);
            }

          /*  for (int i : cm.keySet()) {
                //Thread.sleep(1000);
                System.out.println(i);
            }*/

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        cm.put(23, 23);
        cm.put(24, 24);
        cm.put(25, 25);
        TestConcurrentHashMap t1 = new TestConcurrentHashMap();
        t1.start();

        for(Map.Entry<Integer, Integer> m : cm.entrySet()){

            System.out.println(m);
            Thread.sleep(1000);
        }



    }

}
