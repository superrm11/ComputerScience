package apcs.unit_six_programs;

import java.util.Scanner;
/**
 * 
 * @author Ryan McGee
 *
 */
public class SixFive
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int k = 0;
		while (true)
		{
			k = input.nextInt();
			if (k < 1 || k > 100)
				break;
			k--;
			numbers[k / 10]++;
		}
		for (int j = 0; j < 10; j++)
		{
			System.out.print("| " + ((j * 10) + 1) + "-" + ((j * 10) + 10) + " |");
			for (int i = 0; i < numbers[j] / 5; i++)
				System.out.print("*");
			System.out.println("");
		}
	}

}
