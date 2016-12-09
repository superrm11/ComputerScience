package apcs.unit_six_programs;

public class DeckDriver
{

	public static void main(String[] args)
	{
		Deck d = new Deck();
		d.shuffle();
		while(true)
		{
			Card c = d.dealCard();
			if(c == null)
				break;
			else
				System.out.println(c);
		}
		
	}

}
