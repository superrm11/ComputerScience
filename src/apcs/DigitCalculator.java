package apcs;

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
		for(int i = 0; i < value.length(); i++){
			digits[i] = Character.getNumericValue(value.charAt(i));
			if(digits[i] == 0){
				System.out.println("the digit " + digits[i] + " is zero.");
			}else if(digits[i] % 2 == 0){
				System.out.println("the digit " + digits[i] + " is even.");
			}else {
				System.out.println("the digit " + digits[i] + " is odd.");
			}
		}

	}

}
