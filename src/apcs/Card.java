package apcs;

/**
 * 
 * @author Ryan McGee
 *
 */
public class Card
{
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 1;

	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;

	public Card(int value, int suit)
	{

	}

	private int suit;

	public int getSuit()
	{
		return suit;
	}

	private int faceValue = 0;

	public int getFaceValue()
	{
		return faceValue;
	}

	public void setFaceValue(int i)
	{
		faceValue = i;
	}

	public void setSuit(int i)
	{
		suit = i;
	}

	public void random()
	{
		int i = (int) (Math.random() * 4);
		setSuit(i);

		i = (int) (Math.random() * 13) + 1;
		setFaceValue(i);
	}
	
	public String toString()
	{
		return new String();
	}

}
