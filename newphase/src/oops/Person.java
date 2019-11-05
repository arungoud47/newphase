package oops;

public class Person {

	int id=10;
	String name="Jeevan";
	String address="Ameerpet";
	long mobileNum=999999999;
	char gender='M';
	static String classRoom="Room3";
	
	

	public static void main(String args[]) {

		Person jeevan=new Person();
		
		System.out.println("Id is: " +jeevan.id);
		System.out.println("Name is: " +jeevan.name);
		System.out.println("Address is: " +jeevan.address);
		System.out.println("Mobile Number is: " +jeevan.mobileNum);
		System.out.println("Gender is: " +jeevan.gender);
		
		System.out.println("Class Room is: " +classRoom);
		
        Person prudvi=new Person();
		
		System.out.println("Id is: " +prudvi.id);
		System.out.println("Name is: " +prudvi.name);
		System.out.println("Address is: " +prudvi.address);
		System.out.println("Mobile Number is: " +prudvi.mobileNum);
		System.out.println("Gender is: " +prudvi.gender);
		System.out.println("Class Room is: " +classRoom);
	}

}
