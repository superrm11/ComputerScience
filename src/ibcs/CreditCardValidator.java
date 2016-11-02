package ibcs;

import java.util.Scanner;

/**
 * 
 * @author Ryan McGee
 *
 */
public class CreditCardValidator
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a 16 digit credit card number to validate: ");
		long crNum = input.nextLong();
		input.close();
		int[] digits = getEachDigit16(crNum);
		int sum = 0;
		for (int i = 1; i < digits.length; i += 2)
		{
			System.out.print(digits[i]);
			digits[i] = getEachDigit2(digits[i] * 2)[0] + getEachDigit2(digits[i] * 2)[1];
			System.out.println(" Turns into: " + digits[i]);
		}
		for (int i = 0; i < digits.length; i++)
		{
			sum += digits[i];
		}
		System.out.println(sum);
		if (sum % 10 == 0)
		{
			System.out.println("This IS a valid credit card number.");
		} else
		{
			System.out.println("This is NOT a valid credit card number.");
		}

	}

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
