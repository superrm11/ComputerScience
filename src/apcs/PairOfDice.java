package apcs;

public class PairOfDice {
	private Die d1;
	private Die d2;

	public PairOfDice() {
		d1 = new Die(6);
		d2 = new Die(6);
	}

	private int faceValue1;
	private int faceValue2;

	public void rollDice() {
		faceValue1 = d1.roll();
		faceValue2 = d2.roll();
	}

	public int getFaceValueDie1() {
		return faceValue1;
	}

	public int getFaceValueDie2() {
		return faceValue2;
	}
}
