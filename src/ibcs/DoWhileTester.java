package ibcs;

import java.util.Scanner;

public class DoWhileTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = -1;
		do {
			System.out.println("Enter an integer, or type 0 to exit");
			num = input.nextInt();
			if (num == 0)
				break;
			else
				System.out.println(num + "^2 = " + Math.pow(num, 2));
		} while (true);
		input.close();
	}

}
