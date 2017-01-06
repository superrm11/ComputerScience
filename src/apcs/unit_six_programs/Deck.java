package apcs.unit_six_programs;

public class Deck
{
	private Card[] deck;

	public Deck()
	{
		deck = new Card[52];
		int counter = 0;
		for (int i = 0; i < (deck.length / 4); i++)
		{
			for (int k = 0; k < 4; k++)
			{
				deck[counter] = new Card(i + 1, k);
				counter++;
			}
		}
	}

	public Deck shuffle()
	{
		for (int i = 0; i < 1000; i++)
		{
			int card1 = (int) (Math.random() * 52);
			int card2 = (int) (Math.random() * 52);

			Card temp = this.deck[card1];
			this.deck[card1] = new Card(this.deck[card2]);
			this.deck[card2] = new Card(temp);
		}
		return this;
	}
	/**
	 * Gets the card at the given index
	 * @param index
	 * @return
	 */
	public Card getCard(int index)
	{
		return this.deck[index];
	}

	/**
	 * Takes a card off the top of the deck
	 * @return
	 */
	public Card dealCard()
	{
		if (this.chosenCardIndex <= 51)
			return this.deck[chosenCardIndex++];
		else
			return null;
	}

	/**
	 * 
	 * @return number of cards left that have not been chosen
	 */
	public int getCardsLeft()
	{
		return 52 - chosenCardIndex;
	}

	public String toString()
	{
		String str = new String();
		for (Card c : this.deck)
			str += c + "\n";
		return str;
	}
	/**
	 * 
	 * @return the deck to what it used to be
	 */
	public Deck reset()
	{
		this.deck = new Card[52];
		int counter = 0;
		for (int i = 0; i < (deck.length / 4); i++)
		{
			for (int k = 0; k < 4; k++)
			{
				this.deck[counter] = new Card(i + 1, k);
				counter++;
			}
		}

		this.chosenCardIndex = 0;
		return this;
	}
	
	public Card[] toArray()
	{
		return this.deck;
	}
	

	private int chosenCardIndex = 0;

}
