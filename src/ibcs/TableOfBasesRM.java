package ibcs;

public class TableOfBasesRM {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Decimal\tBinary\tOctal\tHex\tCharacter");
		char character;
		for (int i = 65; i <= 90; i++) {
			character = (char) i;
			System.out.println(i + "\t" 
					+ Integer.toBinaryString(i) + "\t" 
					+ Integer.toOctalString(i) + "\t"
					+ Integer.toHexString(i) + "\t" + character);
		}
	}

}
