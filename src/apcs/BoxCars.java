package apcs;

public class BoxCars {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		int numOfBoxcars = 0;
		numOfBoxcars = 0;
		for (int k = 0; k < 1000; k++) {
			dice.rollDice();
			if (dice.getFaceValue()[0] == 6 && dice.getFaceValue()[1] == 6)
				numOfBoxcars++;
		}
		System.out.println(numOfBoxcars);
	}
}
