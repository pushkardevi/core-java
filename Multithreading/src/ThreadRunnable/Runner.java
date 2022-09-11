package ThreadRunnable;


public class Runner extends Thread {

	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B();

		a1.start();
		try {

			a1.join();

		}

		catch (Exception e) {
			System.out.println(e);
		}
		b1.start();
	}

}
