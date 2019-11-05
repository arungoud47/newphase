package oops;

public class ExMethodOverloading {

	public void addition() {
		int a = 10;
		int b = 20;
		int c;
		c = a + b;
		System.out.println("Result is:" + c);
	}

	public void addition(int a, int b) {

		int c;
		c = a + b;
		System.out.println("Result is:" + c);
	}

	public void addition(float a, float b) {

		float c;
		c = a + b;
		System.out.println("Result is:" + c);
	}

	public static void main(String args[]) {
		ExMethodOverloading obj = new ExMethodOverloading();

		obj.addition();

		obj.addition(100, 200);

		obj.addition(200.04f, 300.11f);
	}

}
