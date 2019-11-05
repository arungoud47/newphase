package oops;

public class ExMethodInDifferentWays {
	
	//Method without Parameters and without return value
	public void additionWopWor() {		
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("Result is(WopWor):" +c);
	}
	
	//Method without Parameters and with return value
	public int additionWopWr() {		
		int a=10;
		int b=20;
		int c;
		c=a+b;
		return c;
	}
	
	//Method with Parameters and without return value
		public void additionWpWor(int a,int b) {				
			int c;
			c=a+b;
			System.out.println("Result is(WpWor):" +c);
		}
	
		//Method with Parameters and with return value
		
		public int additionWpWr(int a,int b) {				
			int c;
			c=a+b;
			return c;
		}
	
		
		
		
		
	public static void main(String args[]) {
		ExMethodInDifferentWays obj=new ExMethodInDifferentWays();		
		obj.additionWopWor();
		int result = obj.additionWopWr();
		System.out.println("Result is(WopWr):" +result);
		
		int x=100;
		int y=200;
		obj.additionWpWor(x,y);
		
		int result1= obj.additionWpWr(x,y);
		System.out.println("Result is(WpWr):" +result1);
	}

}
