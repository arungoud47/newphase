package javabasics;

public class ExNestedIf {

	public static void main(String args[]) {

		String money = "";
		String tickets = "";

		if (money.equals("Yes")) {
			if (tickets.equals("Yes")) {
				System.out.println("Watch Movie");
			} else {
				System.out.println("Go to restaurant");

			}
		} else {
			System.out.println("Go to public park");

		}

	}
}
