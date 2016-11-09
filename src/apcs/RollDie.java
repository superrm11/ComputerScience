package apcs;

import java.util.Scanner;
/**
 * 
 * @author Ryan McGee
 *
 */
public class RollDie
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number of sides: ");
		int sides = input.nextInt();
		input.close();
		Die d = new Die(sides);
		d.roll();
		System.out.println("Rolling the die...");
		System.out.println("You rolled a: " + d.getFaceValue() + "!");
	}

}
