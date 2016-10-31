package apcs;

public class Pig {
	private static PairOfDice dice;
	public static void main(String[] args) {
		dice = new PairOfDice();
		Players turn = Players.player;
		Players winner;
		int playerTotal = 0;
		int computerTotal = 0;
		boolean rollWas2 = false;
		while(true){
			if(playerTotal == 100){
				winner = Players.player;
				break;
			}else if(computerTotal == 100){
				winner = Players.computer;
				break;
			}
			dice.rollDice();
			switch(turn){
			case player:
				int points = getNumberOfPoints();
				if(rollWas2 && points == 0){
					turn = Players.computer;
					break;
				}
			}
		}

	}
	private static enum Players{
		player, computer
	}
	
	private static int getNumberOfPoints(){
		int points = 0;
		if(dice.getTotal() == 2)
			return 0;
		points = dice.getFaceValue()[0] + dice.getFaceValue()[1];
		return points;
	}
	

}
