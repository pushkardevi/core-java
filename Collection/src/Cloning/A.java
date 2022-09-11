package Cloning;

public class A implements Cloneable {

	int i, j;

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
}
