package WaitNotify;

public class Customer {

	int amount = 9000;

	synchronized void withdraw(int amount) {

		if (this.amount < amount) {

			System.out.println("No money in ATM(" + this.amount + ")...wait until money gets deposited in ATM");

		}

		try {
			wait();
		} catch (Exception e) {

			System.out.println(e);

		}

		this.amount = this.amount - amount;
		System.out.println("Money Withdrwing: "+amount);
		System.out.println("After Withdraw: " + this.amount);
	}

	synchronized void deposite(int amount) {

		this.amount = this.amount + amount;

		System.out.println("ATM Filled: " + this.amount);
		notify();
	}

}
