package ibcs;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardValidator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a credit card number to validate: ");
		long crNum = input.nextLong();
		ArrayList<Integer> digits = getEachDigit(crNum);
		int sum = 0;
		for(int i = 0; i < digits.size(); i++){
			sum += digits.get(i);
		}
		if(sum % 10 == 0){
			System.out.println("This IS a valid credit card number.");
		}else{
			System.out.println("This is NOT a valid credit card number.");
		}

	}

	private static ArrayList<Integer> getEachDigit(long i) {
		ArrayList<Integer> digit = new ArrayList<Integer>();
		while (i > 0) {
			int currentDigit = 0;
			while (i % 10 != 0) {
				currentDigit++;
				i--;
			}
			i /= 10;
			digit.add(currentDigit);
		}
		return digit;
	}

}
