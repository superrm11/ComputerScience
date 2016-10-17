package apcs;

import java.util.Scanner;

public class ReviewUnit3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the Temperature: ");
		double temp = input.nextDouble();
		if(temp >= 80)
			System.out.println("I suggest Swimming!");
		else if(temp >= 60)
			System.out.println("I suggest Tennis!");
		else if(temp >= 40)
			System.out.println("I suggest Golf!");
		else
			System.out.println("I suggest Skiing!");
		input.close();
	}

}
