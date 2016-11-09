package apcs;

import java.util.Scanner;

/**
 * 
 * @author Ryan McGee
 *
 */
public class Pig
{
	private static PairOfDice dice;
	private static Players turn = Players.player;
	private static int roundTotal = 0;
	private static int playerTotal = 0;
	private static int computerTotal = 0;

	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		dice = new PairOfDice();
		while (true)
		{
			if (playerTotal >= 100)
			{
				System.out.println("Congrats, man! Would you like to play again?\ty/n");
				if (input.nextLine().equalsIgnoreCase("y"))
				{
					turn = Players.player;
					roundTotal = 0;
					playerTotal = 0;
					computerTotal = 0;
				} else
					break;
			} else if (computerTotal >= 100)
			{
				System.out.println("Better luck next time! Would you like to play again\ty/n");
				if (input.nextLine().equalsIgnoreCase("y"))
				{
					turn = Players.player;
					roundTotal = 0;
					playerTotal = 0;
					computerTotal = 0;
				} else
					break;
			}
			dice.rollDice();
			switch (turn)
			{
			case player:
				System.out.println("Player 1's turn!\nPress Enter to roll your dice.");
				input.nextLine();
				System.out.println("You rolled a " + dice.getFaceValue()[0] + " and a " + dice.getFaceValue()[1]);
				if (dice.getTotal() == 2)
				{
					System.out.println("Oh, no! you rolled 2 ones!");
					playerTotal = 0;
					roundTotal = 0;
					changePlayers();
					break;
				} else if (dice.hasOne())
				{
					System.out.println("Oh, no! you rolled a 1!");
					roundTotal = 0;
					changePlayers();
					break;
				} else
				{
					roundTotal += dice.getTotal();
				}
				System.out.println("Your round total is: " + roundTotal + "\nWould you like to end your turn?\ty/n");
				if (input.nextLine().equalsIgnoreCase("y"))
				{
					changePlayers();
				}

				break;
			case computer:
				Thread.sleep(200);
				System.out.println("It's the computer's turn!\nThe computer rolled a " + dice.getFaceValue()[0]
						+ " and a " + dice.getFaceValue()[1]);
				if (dice.getTotal() == 2)
				{
					System.out.println("Oh, no! The computer rolled 2 ones!");
					computerTotal = 0;
					roundTotal = 0;
					changePlayers();
					break;
				} else if (dice.hasOne())
				{
					System.out.println("Oh, no! The computer rolled a 1!");
					roundTotal = 0;
					changePlayers();
					break;
				} else
				{
					roundTotal += dice.getTotal();
				}

				if (roundTotal >= 20)
				{
					changePlayers();
				}

				break;
			}
		}
		input.close();

	}

	private static enum Players
	{
		player, computer
	}

	private static void changePlayers()
	{
		if (turn == Players.player)
		{
			turn = Players.computer;
			playerTotal += roundTotal;
		} else
		{
			turn = Players.player;
			computerTotal += roundTotal;
		}
		roundTotal = 0;
		System.out.println("The score is: \nYou: " + playerTotal + "\nComputer: " + computerTotal);

	}

}
