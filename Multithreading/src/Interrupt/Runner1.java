package Interrupt;

public class Runner1 {

	public static void main(String[] args) {

		TestInterrupt1 obj1 = new TestInterrupt1();
		obj1.start();

		obj1.interrupt();

	}

}
