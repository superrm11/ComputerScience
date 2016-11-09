package apcs;

/**
 * 
 * @author Ryan McGee
 *
 */
public class Deal20Cards
{

	public static void main(String[] args)
	{
		Card[] c = new Card[20];
		for (int i = 0; i < 20; i++)
		{
			c[i] = new Card();
			c[i].shuffle();
			if (c[i].getFaceValue() == Card.FaceValue.number)
			{
				System.out.println(i + 1 + "] You drew a " + c[i].getFaceValueInt() + " of " + c[i].getSuit());
			} else
			{
				System.out.println(i + 1 + "] You drew a " + c[i].getFaceValue() + " of " + c[i].getSuit());
			}
		}
	}

}
