package apcs.unit_three_programs;

import java.util.ArrayList;
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
		String punctuation = "`1234567890-=+_)(*&^%$#@!~,./?><;:][}{|";
		String uppercaseVowels = "AEIOU";

		/*
		 * 0-4 = a,e,i,o,u, respectively
		 */
		int[] vowels = new int[5];
		int numOfCons = 0;
		int numOfPunc = 0;
		int numOfSpaces = 0;
		ArrayList<Character> otherChars = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
				vowels[0]++;
				break;
			case 'e':
				vowels[1]++;
				break;
			case 'i':
				vowels[2]++;
				break;
			case 'o':
				vowels[3]++;
				break;
			case 'u':
				vowels[4]++;
				break;
			default:
				otherChars.add(str.charAt(i));
			}
		}
		while (otherChars.size() > 0) {
			if (uppercaseVowels.contains(otherChars.get(otherChars.size() - 1).toString())) {
				otherChars.remove(otherChars.size() - 1);
			} else if (punctuation.contains(otherChars.get(otherChars.size() - 1).toString())) {
				otherChars.remove(otherChars.size() - 1);
				numOfPunc++;
			} else if (otherChars.get(otherChars.size() - 1) == ' ') {
				otherChars.remove(otherChars.size() - 1);
				numOfSpaces++;
			} else {
				otherChars.remove(otherChars.size() - 1);
				numOfCons++;
			}
		}
		System.out.println("Number of lowercase vowels: \n\ta: " + vowels[0] 
				+ "\n\te: " + vowels[1] 
				+ "\n\ti: "	+ vowels[2] 
				+ "\n\to: " + vowels[3] 
				+ "\n\tu: " + vowels[4]);
		System.out.println("Number of Consonants: " + numOfCons);
		System.out.println("Number of Punctuation Marks: " + numOfPunc);
		System.out.println("Number of Spaces: " + numOfSpaces);
	}

}
