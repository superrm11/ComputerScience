package apcs.unit_six_programs;

import java.util.Scanner;

public class FibTribTetraLucas
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] nums = new int[25];
		while (true)
		{
			System.out.println("Please select an option:");
			System.out.println("A. Print the first 25 Fibonacci numbers");
			System.out.println("B. Print the first 25 Tribonacci numbers");
			System.out.println("C. Print the first 25 Tetranacci numbers");
			System.out.println("D. Print the first 25 Lucas numbers");
			System.out.println("E. Exit program");

			char c = input.nextLine().charAt(0);

			if (c == 'A')
			{
				nums[0] = 1;
				nums[1] = 1;
				for (int i = 2; i < nums.length; i++)
				{
					nums[i] = nums[i - 1] + nums[i - 2];
				}
				for (int i : nums)
					System.out.println(i);
			} else if (c == 'B')
			{
				nums[0] = 1;
				nums[1] = 1;
				nums[2] = 2;
				for (int i = 3; i < nums.length; i++)
				{
					nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
				}
				for (int i : nums)
					System.out.println(i);

			} else if (c == 'C')
			{
				nums[0] = 1;
				nums[1] = 1;
				nums[2] = 2;
				nums[3] = 4;
				for (int i = 4; i < nums.length; i++)
				{
					nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3] + nums[i - 4];
				}
				for (int i : nums)
					System.out.println(i);
			} else if (c == 'D')
			{
				nums[0] = 1;
				nums[1] = 3;
				for (int i = 2; i < nums.length; i++)
				{
					nums[i] = nums[i - 1] + nums[i - 2];
				}
				for (int i : nums)
					System.out.println(i);
			} else if (c == 'E')
				break;

		}
	}

}
