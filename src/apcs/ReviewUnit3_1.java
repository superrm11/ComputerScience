package apcs;

import java.util.Scanner;

public class ReviewUnit3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input number of points possible: ");
		int pp = input.nextInt();
		System.out.println("Input number of points earned: ");
		int p = input.nextInt();
		double grade = (double)p / pp;
		if (grade < .60)
			System.out.println("You got an F");
		else if (grade < .70)
			System.out.println("You got a D");
		else if (grade < .80)
			System.out.println("You got a C");
		else if (grade < .90)
			System.out.println("You got a B");
		else
			System.out.println("You got an A");
		input.close();
	}

}
