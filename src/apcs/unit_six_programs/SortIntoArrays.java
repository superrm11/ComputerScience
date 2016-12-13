package apcs.unit_six_programs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Ryan McGee
 *
 */
public class SortIntoArrays
{

	public static void main(String[] args)
	{
		System.out.println("Please enter ten integers one at a time: ");
		Scanner input = new Scanner(System.in);
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = input.nextInt();
		}
		int[] odds = getOdds(nums);
		int[] evens = getEvens(nums);
		int[] negatives = getNegatives(nums);
		
		System.out.println("Odds: ");
		for(int i : odds)
			System.out.println("\t" + i);
		
		System.out.println("Evens: ");
		for(int i : evens)
			System.out.println("\t" + i);
		
		System.out.println("Negatives: ");
		for(int i : negatives)
			System.out.println("\t" + i);
		

	}

	private static int[] getEvens(int[] numbers)
	{
		ArrayList<Integer> evens = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] % 2 == 0)
				evens.add(numbers[i]);
		int[] output = new int[evens.size()];
		for(int i = 0; i < output.length; i++)
			output[i] = evens.get(i);
		return output;
	}
	
	private static int[] getOdds(int[] numbers)
	{
		ArrayList<Integer> odds = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] % 2 != 0)
				odds.add(numbers[i]);
		int[] output = new int[odds.size()];
		for(int i = 0; i < output.length; i++)
			output[i] = odds.get(i);
		return output;
	}
	
	private static int[] getNegatives(int[] numbers)
	{
		ArrayList<Integer> negatives = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] < 0)
				negatives.add(numbers[i]);
		int[] output = new int[negatives.size()];
		for(int i = 0; i < output.length; i++)
			output[i] = negatives.get(i);
		return output;
	}

}
