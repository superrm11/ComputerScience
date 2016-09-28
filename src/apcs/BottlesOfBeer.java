package apcs;

public class BottlesOfBeer {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			System.out.println(Math.abs(i - 100) + " Bottles of Beer on the Wall!");
			System.out.println(Math.abs(i - 100) + " Bottles of Beeeeeer!");
			System.out.println("Take one down and pass it around...");
			System.out.println(Math.abs(i - 99) + " Bottles of Beer on the Wall!");
		}

	}

}
