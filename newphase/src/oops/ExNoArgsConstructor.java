package oops;

public class ExNoArgsConstructor {

	int id;
	String name;
	String address;
	long mobileNum;
	char gender;
	
	ExNoArgsConstructor(){
		System.out.println("Hi,This is No Args Constructor");
		 id=10;
		name="Jeevan";
		address="Ameerpet";
		mobileNum=999999999;
		gender='M';
	}

	public static void main(String args[]) {

		ExNoArgsConstructor jeevan=new ExNoArgsConstructor();
		
		System.out.println("Id is: " +jeevan.id);
		System.out.println("Name is: " +jeevan.name);
		System.out.println("Address is: " +jeevan.address);
		System.out.println("Mobile Number is: " +jeevan.mobileNum);
		System.out.println("Gender is: " +jeevan.gender);
		
        ExNoArgsConstructor prudvi=new ExNoArgsConstructor();
		
		System.out.println("Id is: " +prudvi.id);
		System.out.println("Name is: " +prudvi.name);
		System.out.println("Address is: " +prudvi.address);
		System.out.println("Mobile Number is: " +prudvi.mobileNum);
		System.out.println("Gender is: " +prudvi.gender);
	}

}
