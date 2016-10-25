package apcs;

public class Methods4_1 {

	public static void main(String[] args) {
		powersOfTwo();
		alarm(2);
		System.out.println(sum100());
		System.out.println(maxOfTwo(5,8));
		System.out.println(average(2,6));

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
}
