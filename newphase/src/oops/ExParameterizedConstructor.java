package oops;

public class ExParameterizedConstructor {

	int id;
	String name;
	String address;
	long mobileNum;
	char gender;
	
	
	
	ExParameterizedConstructor(int id,String name,String address,long mobileNum,char gender){		
		this.id=id;
		this.name=name;
		this.address=address;
		this.mobileNum=mobileNum;
		this.gender=gender;
	}

	public static void main(String args[]) {

		ExParameterizedConstructor jeevan=new ExParameterizedConstructor(10,"Jeevan","Ameerpet",9999999,'M');
		
		System.out.println("Id is: " +jeevan.id);
		System.out.println("Name is: " +jeevan.name);
		System.out.println("Address is: " +jeevan.address);
		System.out.println("Mobile Number is: " +jeevan.mobileNum);
		System.out.println("Gender is: " +jeevan.gender);
		
        ExParameterizedConstructor prudvi=new ExParameterizedConstructor(11,"Prudvi","KPHB",888888,'M');
		
		System.out.println("Id is: " +prudvi.id);
		System.out.println("Name is: " +prudvi.name);
		System.out.println("Address is: " +prudvi.address);
		System.out.println("Mobile Number is: " +prudvi.mobileNum);
		System.out.println("Gender is: " +prudvi.gender);
	}

}
