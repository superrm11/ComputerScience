package ibcs;

public class ArrayOfHopeRM {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		char[] letters = new char[26];
		for (int i = 65; i <= 90; i++) {
			letters[i - 65] = (char) i;
		}
		for (int i = 0; i < 26; i++) {
			if (letters[i] != 'Z')
				System.out.print(letters[i] + ", ");
			else
				System.out.print(letters[i]);
		}
	}

}
