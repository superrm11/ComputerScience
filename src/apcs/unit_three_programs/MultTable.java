package apcs.unit_three_programs;

public class MultTable {

	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		int factor = 1;
		while (factor <= 12) {
			for (int i = 1; i < 13; i++) {
				System.out.print((i * factor) + "\t");
			}
			System.out.println("");
			factor++;
		}

	}

}
