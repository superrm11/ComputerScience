package ibcs;

import java.util.Scanner;

public class ProjectCoins {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an amount of cents:");
		int cents = input.nextInt();
		input.close();
		int numOfQuarters = cents / 25;
		int numOfDimes = (cents - (numOfQuarters * 25)) / 10;
		int numOfNickles = (cents - (numOfQuarters * 25) - (numOfDimes * 10)) / 5;
		int numOfPennies = cents - (numOfQuarters * 25) - (numOfDimes * 10) - (numOfNickles * 5);
		System.out.println("The smallest amount of coins you can get with the value " + cents + " is:\n\tQuarters: "
				+ numOfQuarters + "\n\tDimes: " + numOfDimes + "\n\tNickels: " + numOfNickles + "\n\tPennies: "
				+ numOfPennies);

	}

}
