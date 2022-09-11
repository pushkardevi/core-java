package WaitNotify;

public class Runner {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		new Thread() {
			@Override
			public void run() {
				c1.withdraw(15000);
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				c1.deposite(10000);
			}
		}.start();
	}

}
