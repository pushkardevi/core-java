package Interrupt;

public class TestInterrupt1 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println(i);
				//Thread.sleep(1000);
			}

		} catch (Exception e) {

			System.out.println("Exception");
		}
	}
}
