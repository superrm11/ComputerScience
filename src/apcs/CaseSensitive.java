package apcs;

import java.util.Scanner;

public class CaseSensitive {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		String lowercase = "qwertyuiopasdfghjklzxcvbnm";
		String uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
		int numOfLowercase = 0;
		int numOfUppercase = 0;
		for (int i = 0; i < str.length(); i++)
			if (lowercase.contains(str.substring(i, i + 1)))
				numOfLowercase++;
		for (int i = 0; i < str.length(); i++)
			if (uppercase.contains(str.substring(i, i + 1)))
				numOfUppercase++;
		System.out.println(str + " contains " + numOfLowercase + " lowercase letters and " + numOfUppercase
				+ " uppercase letters.");
	}

}
