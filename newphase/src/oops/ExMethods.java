package oops;

public class ExMethods {
	
	
	
	public static void addition() {
	
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("Result is:" +c);
		
	}
	
	public void display() {
		System.out.println("Hi");
		addition();
	}
	
	public static void main(String args[]) {
		ExMethods obj=new ExMethods();
		
		obj.display();
		
		
	}

}
