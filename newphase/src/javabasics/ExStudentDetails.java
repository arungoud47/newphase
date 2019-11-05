package javabasics;

public class ExStudentDetails {
	
	public static void main(String args[]) {
		int id=101;
		String name="Jeevan";
		String address="Ameerpet";
		long mobileNum=9999999999l;
		char gender='M';
		int sub1=56;
		int sub2=85;
		
		int totalMarks=sub1+sub2;
		
		float avg=totalMarks/2;
		
		System.out.println("Id is: " + id);
		System.out.println("Name  is: " + name);
		System.out.println("Address is: " + address);
		System.out.println("Mobile Number is: " + mobileNum);
		System.out.println("Gender is: " + gender);
		System.out.println("Total Marks is: " + totalMarks);
		System.out.println("Average Marks is: " + avg);
		
	}
}
