package apcs.unit_three_programs;

import java.util.Scanner;

public class DigitCalculator {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an Integer: ");
		String value = input.nextLine();
		int[] digits = new int[value.length()];
		int oddNumbers = 0;
		int evenNumbers = 0;
		int zeroNumbers = 0;
		for (int i = 0; i < value.length(); i++) {
			digits[i] = Character.getNumericValue(value.charAt(i));
			if (digits[i] == 0) {
				System.out.println("the digit " + digits[i] + " is zero.");
				zeroNumbers++;
			} else if (digits[i] % 2 == 0) {
				System.out.println("the digit " + digits[i] + " is even.");
				evenNumbers++;
			} else {
				System.out.println("the digit " + digits[i] + " is odd.");
				oddNumbers++;
			}
		}
		input.close();
		System.out.println("There are " + zeroNumbers + " zeros, " + evenNumbers + " even numbers, and " + oddNumbers
				+ " odd numbers.");

	}

}
