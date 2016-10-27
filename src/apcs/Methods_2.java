package apcs;

import java.util.Scanner;

public class Methods_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the number of sides: ");
		int numOfSides = input.nextInt();
		Die d = new Die(numOfSides);
		System.out.println(d.roll());
	}
	
}
