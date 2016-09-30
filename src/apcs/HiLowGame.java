package apcs;

import java.util.Scanner;

public class HiLowGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in -1 to exit.");
		System.out.println("Try a number!");
		int number = (int) (Math.random() * 100) + 1;
		int enteredNumber = input.nextInt();
		if (enteredNumber != number)
			do {
				if(enteredNumber == -1)
					break;
				if(enteredNumber > number)
					System.out.println("Too High!");
				else
					System.out.println("Too Low!");
				enteredNumber = input.nextInt();
			} while (enteredNumber != number);
		System.out.println("Congradulations! you have finished the game!");
		input.close();
	}

}
