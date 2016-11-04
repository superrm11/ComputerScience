package ibcs;

import java.util.Scanner;

/**
 *  Inputs a 16 digit credit card, and if it follows luhn's algorithm, return true to the user.
 * @author Ryan McGee
 * 
 */
public class CreditCardValidator
{

	public static void main(String[] args)
	{
		//Inputing the number
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a 16 digit credit card number to validate: ");
		long crNum = input.nextLong();
		input.close();
		
		//Gets each digit and dumps it into an array. If the user entered a number 
		//that is not 16 digits, it will break here.
		int[] digits = getEachDigit16(crNum);
		
		//Adds up the "digits with multiple digits" after doubling every other one.
		for (int i = 1; i < digits.length; i += 2)
		{
			System.out.print(digits[i]);
			digits[i] = getEachDigit2(digits[i] * 2)[0] + getEachDigit2(digits[i] * 2)[1];
			System.out.println(" Turns into: " + digits[i]);
		}
		
		//Adds up all the digits in the array
		int sum = 0;
		for (int i = 0; i < digits.length; i++)
		{
			sum += digits[i];
		}
		
		System.out.println(sum);
		
		//If the sum is a multiple of 10, return true to the user. else, return false.
		if (sum % 10 == 0)
		{
			System.out.println("This IS a valid credit card number.");
		} else
		{
			System.out.println("This is NOT a valid credit card number.");
		}

	}
	/**
	 *  Gets each digit from a 16 digit long
	 * @param i 16 digit long
	 * @return array of each digit
	 */
	private static int[] getEachDigit16(long i)
	{
		int[] digit = new int[16];
		int digitNum = 0;
		while (i > 0)
		{
			int currentDigit = 0;
			while (i % 10 != 0)
			{
				currentDigit++;
				i--;
			}
			i /= 10;
			digit[digitNum] = currentDigit;
			digitNum++;
		}
		return digit;
	}

	/**
	 * Gets each digit from a 2 digit integer
	 * @param i 2 digit integer
	 * @return array of each digit
	 */
	private static int[] getEachDigit2(int i)
	{
		int[] digit = new int[2];
		int digitNum = 0;
		while (i > 0)
		{
			int currentDigit = 0;
			while (i % 10 != 0)
			{
				currentDigit++;
				i--;
			}
			i /= 10;
			digit[digitNum] = currentDigit;
			digitNum++;
		}
		return digit;
	}

}
