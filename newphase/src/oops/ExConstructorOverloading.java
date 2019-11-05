package oops;

public class ExConstructorOverloading {

	int id;
	String name;
	String address;
	long mobileNum;
	char gender;
	
	ExConstructorOverloading(){
		System.out.println("Hi,This is No Args Constructor");
		
	}
	
	ExConstructorOverloading(int id,String name,String address,long mobileNum,char gender){		
		this.id=id;
		this.name=name;
		this.address=address;
		this.mobileNum=mobileNum;
		this.gender=gender;
		
	}
	
	ExConstructorOverloading(int id,String name,String address,long mobileNum){		
		this.id=id;
		this.name=name;
		this.address=address;
		this.mobileNum=mobileNum;
		
	}

	public static void main(String args[]) {

		ExConstructorOverloading jeevan=new ExConstructorOverloading(10,"Jeevan","Ameerpet",9999999,'M');
		
		System.out.println("Id is: " +jeevan.id);
		System.out.println("Name is: " +jeevan.name);
		System.out.println("Address is: " +jeevan.address);
		System.out.println("Mobile Number is: " +jeevan.mobileNum);
		System.out.println("Gender is: " +jeevan.gender);
		
        ExConstructorOverloading prudvi=new ExConstructorOverloading(11,"Prudvi","KPHB",888888,'M');
		
		System.out.println("Id is: " +prudvi.id);
		System.out.println("Name is: " +prudvi.name);
		System.out.println("Address is: " +prudvi.address);
		System.out.println("Mobile Number is: " +prudvi.mobileNum);
		System.out.println("Gender is: " +prudvi.gender);
		
		ExConstructorOverloading obj=new ExConstructorOverloading();
	}

}
