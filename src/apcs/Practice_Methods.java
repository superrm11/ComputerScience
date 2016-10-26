package apcs;
/**
 * 
 * @author Ryan McGee
 *
 */
public class Practice_Methods {

	public static int sum100() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	public static int sumRange(int x, int y) {
		int sum = 0;
		if (y < x) {
			System.out.println("The second number MUST be greater than the first!");
			return 0;
		}
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

	public static boolean evenlyDivisable(int x, int y) {
		return (x / y == (double) x / (double) y || y / x == (double) x / (double) y);
	}

	public static boolean isAlpha(char c) {
		return ((c >= 65 && c <= 90) || (c >= 97 && c <= 122));
	}
	
	public static String reverse(String s){
		String newString = "";
		for(int i = s.length() - 1; i >=0; i--){
			newString = newString + s.charAt(i);
		}
		return newString;
	}

}
