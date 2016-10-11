package ibcs;

import java.util.Scanner;

public class PlanetWeight {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		String[] planets = { "Voltar", "Krypton", "Fertos", "Servontos" };
		Scanner input = new Scanner(System.in);
		boolean finished = false;
		int selection = 0;
		
		System.out.println("What is your weight on earth? ");
		double weight = input.nextDouble();
		
		while (!finished) {
			System.out.println("\nPlease select the planet: \n1: Voltar\n2: Krypton\n3: Fertos\n4: Servontos\n");
			selection = input.nextInt();
			
			switch (selection) {
			case 1:
				weight *= 0.091;
				finished = true;
				break;
			case 2:
				weight *= 0.720;
				finished = true;
				break;
			case 3:
				weight *= 0.865;
				finished = true;
				break;
			case 4:
				weight *= 4.612;
				finished = true;
				break;
			default:
				System.out.println("That is not a valid number!");
			}
		}
		System.out.println("Your weight on " + planets[selection - 1] + " is " + weight);
		input.close();
	}

}
