package Cloning;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		A obj1 = new A();

		obj1.i = 5;
		obj1.j = 6;

		A obj2 = (A) obj1.clone();

		obj2.j = 8;  
		System.out.println(obj1);
		System.out.println(obj2);

//		A obj2 = obj1;
//		obj1.j = 9;
//		System.out.println(obj1);
//		System.out.println(obj2);

	}

}
