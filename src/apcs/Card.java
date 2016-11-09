package apcs;

/**
 * 
 * @author Ryan McGee
 *
 */
public class Card
{
	public enum Suit
	{
		hearts, diamonds, clubs, spades, undefined
	}

	private Suit suit = Suit.undefined;

	public Suit getSuit()
	{
		return suit;
	}

	public enum FaceValue
	{
		jack, queen, king, ace, number, undefined
	}

	private FaceValue faceValue = FaceValue.undefined;

	private int faceValueInt = 0;

	public FaceValue getFaceValue()
	{
		return faceValue;
	}

	public int getFaceValueInt()
	{
		return faceValueInt;
	}

	public void shuffle()
	{
		int i = (int) (Math.random() * 4);
		switch (i)
		{
		case 0:
			suit = Suit.clubs;
			break;
		case 1:
			suit = Suit.diamonds;
			break;
		case 2:
			suit = Suit.hearts;
			break;
		case 3:
			suit = Suit.spades;
			break;
		default:
			suit = Suit.undefined;
		}

		i = (int) (Math.random() * 13) + 1;
		switch (i)
		{
		case 11:
			faceValue = FaceValue.jack;
			faceValueInt = 0;
			break;
		case 12:
			faceValue = FaceValue.queen;
			faceValueInt = 0;
			break;
		case 13:
			faceValue = FaceValue.king;
			faceValueInt = 0;
			break;
		case 1:
			faceValue = FaceValue.ace;
			faceValueInt = 0;
			break;
		default:
			faceValue = FaceValue.number;
			faceValueInt = i;

		}
	}

}
