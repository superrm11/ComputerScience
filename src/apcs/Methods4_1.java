package apcs;

public class Methods4_1 {

	public static void main(String[] args) {
		System.out.println(removeOnesDigit(775));

	}

	public static int countA(String s) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A')
				num++;
		}
		return num;
	}

	public static void powersOfTwo() {
		for (int i = 2; i <= 10; i++) {
			System.out.println("2^" + i + " = " + Math.pow(2, i));
		}
	}

	public static void alarm(int num) {
		if (num < 1) {
			System.out.println("the number must be > 0!");
			return;
		}
		for (int i = 0; i < num; i++) {
			System.out.println("Alarm!");
		}
	}

	public static int sum100() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	public static int maxOfTwo(int a, int b){
		if(a > b)
			return a;
		else if(b > a)
			return b;
		return 0;
	}
	public static boolean larger(double a, double b){
		if(a > b)
			return true;
		else 
			return false;
	}
	public static double average(int a, int b){
		return (a + b) / 2.0;
	}
	
	public static int findTensDigit(int i){
		while(i > 99){
			i-=100;
			}
		return i / 10;
	     
	}
	
	public static int removeOnesDigit(int input){
		while(input % 10 != 0){
			input--;
		}
		return input / 10;
	}
}
