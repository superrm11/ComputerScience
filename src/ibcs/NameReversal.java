package ibcs;

import java.util.Scanner;

public class NameReversal {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		char[] letters = new char[name.length()];
		for(int i = 0; i < name.length(); i++){
			letters[i] = name.charAt(i);
		}
		char[] newLetters = new char[letters.length];
		int b = 0;
		for(int i = (Math.abs(letters.length - 1)); i >= 0; i--){
			newLetters[b] = letters[i];
			b++;
		}
		String backwardsName = new String(newLetters);
		System.out.println(backwardsName);
		input.close();
	}

}
