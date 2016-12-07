package apcs.unit_six_programs;

public class Deck
{
	public Deck()
	{
		Card[] deck = new Card[52];
		int counter = 0;
		for (int i = 0; i < (deck.length / 4); i++)
		{
			for(int k = 0; k < 4; k++)
			{
				deck[counter] = new Card(i,k);
				counter++;
			}
		}
	}
}
