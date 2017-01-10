package apcs.semesterProject;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish
{
	private static ArrayList<Card> playerHand;
	private static ArrayList<Card> computerHand;

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\tWelcome to Go Fish!\n");

		Deck d = new Deck().shuffle();

		playerHand = d.dealCard(5);
		computerHand = d.dealCard(5);

		int playerPairs = 0;
		int computerPairs = 0;

		while (true)
		{
			switch (turn)
			{
			case player:
				if (playerHand.size() == 0)
				{
					System.out.println("You have no cards! Drawing 5 more...");
					playerHand = d.dealCard(5);
				}
				playerPairs += findPairs(playerHand);
				System.out.println("It is your turn! Here are your cards...\n" + handValue(playerHand)
						+ "\n What would you like to ask Player 2 for?");
				int cardIndex = input.nextInt();

				int numOfCardsRecieved = askFor(cardIndex, Turn.player);
				if (numOfCardsRecieved == 0)
				{
					System.out.println("The computer does not have that card! Go Fish!");
					playerHand.add(d.dealCard());
					turn = Turn.computer;
					break;
				}
				
			case computer:

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

	private static int findPairs(ArrayList<Card> hand)
	{
		int pairs = 0;
		for (int i = 0; i < hand.size(); i++)
		{
			for (int k = i; k >= 0; k--)
			{
				if (hand.get(i).getFaceValue() == hand.get(k).getFaceValue())
				{
					hand.remove(i);
					hand.remove(k);
					pairs++;
				}
			}
		}
		return pairs;
	}

	private static int askFor(int cardIndex, Turn turn)
	{
		int count = 0;
		switch (turn)
		{
		case player:
			for (int i = computerHand.size() - 1; i >= 0; i++)
			{
				if (computerHand.get(i).getFaceValue() == playerHand.get(cardIndex).getFaceValue())
				{
					computerHand.remove(i);
					count++;
				}
			}
			break;
		case computer:
			for (int i = playerHand.size() - 1; i >= 0; i++)
			{
				if (playerHand.get(i).getFaceValue() == computerHand.get(cardIndex).getFaceValue())
				{
					playerHand.remove(i);
					count++;
				}
			}
			break;
		}
		return count;
	}

	private enum Turn
	{
		player, computer
	}

	private static Turn turn = Turn.player;

}
