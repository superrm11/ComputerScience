package apcs;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a palindrome: ");
		String palindrome = input.nextLine();
		char[] palArray;
		int numOfLetters = 0;
		palindrome = palindrome.toLowerCase();
		for (int i = 0; i < palindrome.length(); i++)
			if (palindrome.charAt(i) != ' ' && palindrome.charAt(i) != '.' && palindrome.charAt(i) != ',') 
				numOfLetters++;
		palArray = new char[numOfLetters];
		for(int i = 0; i < numOfLetters; i++){
			if (palindrome.charAt(i) != ' ' && palindrome.charAt(i) != '.' && palindrome.charAt(i) != ',')
				palArray[i] = palindrome.charAt(i);
		}
		System.out.println(palArray.length);
		System.out.println(new String(palArray));
	}

}
