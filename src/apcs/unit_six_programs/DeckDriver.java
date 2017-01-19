package apcs.unit_six_programs;

public class DeckDriver
{

	public static void main(String[] args)
	{
		Deck d = new Deck();
		for(int i = 0; i < 52; i++)
		{
			System.out.println(d.dealCard());
		}
		
	}

}
