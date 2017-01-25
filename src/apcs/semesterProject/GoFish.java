package apcs.semesterProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class GoFish
{
	private static ArrayList<Card> playerHand;
	private static ArrayList<Card> computerHand;

	private static Deck d;

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\tWelcome to Go Fish!\n");

		d = new Deck().shuffle();

		playerHand = d.dealCard(5);
		computerHand = d.dealCard(5);

		int playerPairs = 0;
		int computerPairs = 0;
		int cardIndex = 0;

		while (true)
		{
			switch (turn)
			{
			case player:
				
				do
				{
				if (playerHand.size() == 0)
				{
					System.out.println("You have no cards! Drawing 5 more...");
					playerHand = d.dealCard(5);
					if(d.getCardsLeft() < 1)
					{
						System.out.println("Oh! there are no more cards left in the deck!");
						if(playerHand.size() < 1 && computerHand.size() < 1)
							win(computerPairs, playerPairs);
							turn = Turn.computer;
							break;
					}
				}
				
				playerPairs += findPairs(Turn.player);
				}while(playerHand.size() < 1);

				System.out.println("It is your turn! Here are your cards...\n" + handValue(playerHand) + "You have "
						+ playerPairs + " pair(s)!" + "\n What would you like to ask the Computer for?");
				cardIndex = input.nextInt();

				playerPairs += askFor(cardIndex, Turn.player);

				playerPairs += findPairs(Turn.player);

				break;

			case computer:
				
				do
				{
				if (computerHand.size() < 1)
				{
					System.out.println("The computer has no cards! Drawing 5 more...");
					computerHand = d.dealCard(5);
					if(d.getCardsLeft() < 1)
					{
						System.out.println("Oh! there are no more cards left in the deck!");
						if(computerHand.size() < 1 && playerHand.size() < 1)
							win(computerPairs, playerPairs);
						turn = Turn.player;
						break;
					}
					
				}
				
				computerPairs += findPairs(Turn.computer);
				}while(computerHand.size() < 1);

				System.out.println("It is the computer's turn!");
				cardIndex = (int) (Math.random() * computerHand.size());
				System.out.println("The computer has " + computerPairs + " pair(s)!");
				System.out.println("The computer asked for a " + computerHand.get(cardIndex));

				computerPairs += askFor(cardIndex, Turn.computer);

				System.out.println("");
				break;
			}
		}
	}

	private static String handValue(ArrayList<Card> hand)
	{
		String str = new String();
		for (int i = 0; i < hand.size(); i++)
		{
			str += i + ") " + hand.get(i) + "\n";
		}
		return str;
	}

	private static int findPairs(Turn turn)
	{

		int pairs = 0;
		switch (turn)
		{
		case player:

			for (int i = 0; i < playerHand.size(); i++)
			{
				for (int k = i - 1; k >= 0; k--)
				{
					if (playerHand.get(i) != null
							&& playerHand.get(i).getFaceValue() == playerHand.get(k).getFaceValue())
					{
						pairs++;
						playerHand.set(i, new Card(Card.UNREGISTERED, Card.UNREGISTERED));
						playerHand.set(k, new Card(Card.UNREGISTERED, Card.UNREGISTERED));
					}
				}
			}

			for (int i = playerHand.size() - 1; i >= 0; i--)
			{
				if (playerHand.get(i).getFaceValue() >= Card.UNREGISTERED)
					playerHand.remove(i);
			}
			break;
		case computer:
			for (int i = 0; i < computerHand.size(); i++)
			{
				for (int k = i - 1; k >= 0; k--)
				{
					if (computerHand.get(i) != null
							&& computerHand.get(i).getFaceValue() == computerHand.get(k).getFaceValue())
					{
						pairs++;
						computerHand.set(i, new Card(Card.UNREGISTERED, Card.UNREGISTERED));
						computerHand.set(k, new Card(Card.UNREGISTERED, Card.UNREGISTERED));
					}
				}
			}

			for (int i = computerHand.size() - 1; i >= 0; i--)
			{
				if (computerHand.get(i).getFaceValue() >= Card.UNREGISTERED)
					computerHand.remove(i);
			}
			break;
		}

		return pairs;

	}

	private static int askFor(int cardIndex, Turn turn)
	{
		int count = 0;
		switch (turn)
		{
		case player:
			for (int i = computerHand.size() - 1; i >= 0; i--)
			{
				if (computerHand.get(i).getFaceValue() == playerHand.get(cardIndex).getFaceValue())
				{
					System.out.println("Congrats! You got a " + computerHand.get(i));
					computerHand.remove(i);
					playerHand.remove(cardIndex);
					return 1;
				}
			}

			System.out.println("The computer does not have that card! Go Fish!");
			playerHand.add(d.dealCard());
			System.out.println("You got a " + playerHand.get(playerHand.size() - 1));
			System.out.println("");
			GoFish.turn = Turn.computer;
			return 0;
		case computer:
			for (int i = playerHand.size() - 1; i >= 0; i--)
			{
				if (playerHand.get(i).getFaceValue() == computerHand.get(cardIndex).getFaceValue())
				{
					System.out.println("The computer took your " + playerHand.get(i));
					playerHand.remove(i);
					computerHand.remove(cardIndex);
					return 1;
				}
			}

			System.out.println("The Player does not have that card! Go Fish!");
			computerHand.add(d.dealCard());
			GoFish.turn = Turn.player;
			return 0;
		}
		return count;
	}

	private static void win(int computerPairs, int playerPairs)
	{
		if (playerPairs > computerPairs)
			System.out.println("The player has won! Congrats!");
		else if (computerPairs > playerPairs)
			System.out.println("The computer has won! better luck next time...");
		else
			System.out.println("It was a draw! Wow!");
		System.out.println("Number of computer's pairs: " + computerPairs);
		System.out.println("Number of player's pairs: " + playerPairs);
		
		System.exit(0);
	}

	private enum Turn
	{
		player, computer
	}

	private static Turn turn = Turn.player;

}
