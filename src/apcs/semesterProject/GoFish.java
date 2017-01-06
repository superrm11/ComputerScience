package apcs.semesterProject;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\tWelcome to Go Fish!\n");

		ArrayList<Card> playerHand;
		ArrayList<Card> computerHand;

		Deck d = new Deck().shuffle();

		playerHand = d.dealCard(5);
		computerHand = d.dealCard(5);

		while (true)
		{
			System.out.println("It is your turn! Here are your cards...\n" + playerHand
					+ "\n What would you like to ask Player 2 for?");

		}
	}

	private static String handValue(ArrayList<Card> hand)
	{
		String str = new String();
		for (int i = 0; i < hand.size(); i++)
		{
			str += i + ". " + hand.get(i) + "\n";
		}
		return str;
	}

}
