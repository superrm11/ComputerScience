package apcs.unit_six_programs;

public class DeckDriver
{

	public static void main(String[] args)
	{
		Deck d = new Deck();
		d.shuffle();
		Card c = d.dealCard();
		System.out.println(c);
		
	}

}
