package apcs.semesterProject;

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
		this.setFaceValue(value);
		this.setSuit(suit);
	}
	
	public Card(Card old)
	{
		this.setFaceValue(old.getFaceValue());
		this.setSuit(old.getSuit());
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
			faceValueName = "Ace";
		else
			faceValueName = String.valueOf(i);
	}

	public void setSuit(int i)
	{
		suit = i;
		
		if(suit == CLUBS)
			suitName = "Clubs";
		else if(suit == SPADES)
			suitName = "Spades";
		else if(suit == DIAMONDS)
			suitName = "Diamonds";
		else if(suit == HEARTS)
			suitName = "Hearts";
		
	}
	
	String faceValueName;
	
	String suitName;

	public void random()
	{
		int i = (int) (Math.random() * 4);
		setSuit(i);

		i = (int) (Math.random() * 13) + 1;
		setFaceValue(i);
	}
	
	public String toString()
	{
		
		return new String(faceValueName + " of " + suitName);
	}

}
