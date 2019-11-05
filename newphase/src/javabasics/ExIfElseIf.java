package javabasics;

public class ExIfElseIf {

	public static void main(String args[]) {

		String course = "Mechanic";

		if (course.equals("CSE"))
			System.out.println("Join in CSE");
		else if (course.equals("ECE"))
			System.out.println("Join in ECE");
		else if (course.equals("Mechanic"))
			System.out.println("Join in Mechanic");
		else if (course.equals("EEE"))
			System.out.println("Join in EEE");
		else
			System.out.println("Join in Degree");

	}
}
