package ibcs;

import java.util.Scanner;

public class ProjectPizza {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a diameter (in inches) for the PIZZA:");
		int size = input.nextInt();
		input.close();
		double cost = .75 + 1.0 + (.05 * Math.pow(size, 2));
		System.out.println("The cost of this PIZZA is $" + cost);
	}

}
