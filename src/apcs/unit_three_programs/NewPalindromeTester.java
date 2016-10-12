package apcs.unit_three_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class NewPalindromeTester {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		String str, another = "y";
		int left, right;
		Scanner scan = new Scanner(System.in);
		String punctuation = "~!@#$%^&*()_+`-=?></.,:';}{][| ";
		ArrayList<Character> charArrayList = new ArrayList<Character>();

		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();
			str = str.toLowerCase();
			charArrayList.clear();
			for (int i = 0; i < str.length(); i++) {
				if (!punctuation.contains(str.substring(i, i + 1)))
					charArrayList.add(str.charAt(i));
			}
			str = "";
			for (int i = 0; i < charArrayList.size(); i++) {
				str = str + charArrayList.get(i);
			}
			
			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}

			System.out.println();

			if (left < right)
				System.out.println("That string is NOT a palindrome.");
			else
				System.out.println("That string IS a palindrome.");

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = scan.nextLine();
		}
		scan.close();
	}

}
