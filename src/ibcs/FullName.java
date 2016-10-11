package ibcs;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name? ");
		String fName = input.next();
		System.out.println("What is your last name? ");
		String lName = input.next();
		System.out.println("Your full name is " + fName + " " + lName + ".");
		input.close();
	}

}
