package apcs;

/**
 * 
 * @author Ryan McGee
 *
 */
public class PairOfDice
{
	private Die d1;
	private Die d2;

	public PairOfDice()
	{
		d1 = new Die(6);
		d2 = new Die(6);
	}

	private int faceValue1;
	private int faceValue2;

	public void rollDice()
	{
		faceValue1 = d1.roll();
		faceValue2 = d2.roll();
	}

	public int[] getFaceValue()
	{
		return new int[]
		{ faceValue1, faceValue2 };
	}

	public int getTotal()
	{
		return faceValue1 + faceValue2;
	}

	public boolean hasOne()
	{
		return (faceValue1 == 1 || faceValue2 == 1);
	}
}
