package apcs.unit_six_programs;

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
		
		if(faceValue == JACK)
			faceValueName = "Jack";
		else if(faceValue == QUEEN)
			faceValueName = "Queen";
		else if(faceValue == KING)
			faceValueName = "King";
		else if(faceValue == ACE)
			faceValueName = "ace";
		else
			faceValueName = String.valueOf(i);
	}

	public void setSuit(int i)
	{
		suit = i;
		
		
	}
	
	String faceValueName;

	public void random()
	{
		int i = (int) (Math.random() * 4);
		setSuit(i);

		i = (int) (Math.random() * 13) + 1;
		setFaceValue(i);
	}
	
	public String toString()
	{
		
		if(faceValue == JACK)
	}

}
