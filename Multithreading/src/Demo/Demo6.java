package Demo;

public class Demo6 {

	private static class A {

		void showA() {
			for (int i = 1; i <= 100; i++) {
				System.out.print("Hey A ");
			}
			System.out.println();
		}
	}

	private static class B {

		void showB() {
			for (int i = 1; i <= 100; i++) {
				System.out.print("Hey B ");
			}
			System.out.println();
		}
	}

	private static class C {

		void showC() {
			for (int i = 1; i <= 100; i++) {
				System.out.print("Hey C ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		A a = new A();
		B b = new B();
		C c = new C();

		Thread t1 = new Thread(() -> a.showA());
		Thread t2 = new Thread(() -> b.showB());
		Thread t3 = new Thread(() -> c.showC());

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
	}

}
