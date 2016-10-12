package apcs.unit_three_programs;

import java.util.Scanner;

public class RockPaperScissors {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		String hand;
		int compGenerated;
		int handNum;
		do {
			System.out.println("Choose your hand! (type: Rock, Paper, or Scissors");
			hand = input.nextLine();
			compGenerated = (int) Math.floor(Math.random() * 3);
			if (hand.equalsIgnoreCase("rock"))
				handNum = 0;
			else if (hand.equalsIgnoreCase("scissors"))
				handNum = 1;
			else if (hand.equalsIgnoreCase("paper"))
				handNum = 2;
			else {
				System.out.println("Invalid input: please enter either Rock, Paper, or Scissors.");
				continue;
			}

			System.out.println("You chose: " + hand);

			if (compGenerated == 0)
				System.out.println("The computer chose Rock.");
			else if (compGenerated == 1)
				System.out.println("The computer chose Scissors.");
			else
				System.out.println("The computer chose Paper.");

			if (handNum == compGenerated)
				System.out.println("It's a Draw!");
			else if ((handNum == 0 && compGenerated == 1) 
					|| (handNum == 1 && compGenerated == 2)
					|| (handNum == 2 && compGenerated == 0))
				System.out.println("You Win!");
			else
				System.out.println("You Lose.");
			System.out.println("\n\tRestart?  y/n");
			if (input.nextLine().equalsIgnoreCase("n"))
				exit = true;

		} while (!exit);
		input.close();
		System.out.println("\tBye!");
	}

}
