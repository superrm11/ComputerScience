package apcs.unit_three_programs;

import java.util.Scanner;

public class SlotMachine {
	/**
	 * @author Ryan McGee
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		int[] num = new int[3];
		do{
			System.out.println("Press enter to spin!");
			input.nextLine();
			num[0] = (int)Math.floor(Math.random() * 10);
			num[1] = (int)Math.floor(Math.random() * 10);
			num[2] = (int)Math.floor(Math.random() * 10);
			System.out.print("B");
			for(int i = 0; i < 15; i++){
				Thread.sleep(100);
				System.out.print("z");
			}
			System.out.println("");
			for(int i = 0; i < num.length; i++){
				System.out.print(num[i]);
				Thread.sleep(1000);
			}
			System.out.println("");
			if(num[0] == num[1] && num[1] == num[2])
				System.out.println("You win the JACKPOT!!! (3 out of 3)");
			else if(num[0] == num[1] || num[1] == num[2] || num[0] == num[2])
				System.out.println("You get a mini win!!! (2 out of 3)");
			else
				System.out.println("Better luck next time!");
			System.out.println("\n\tWould you like to play again? (y/n)");
			if(input.nextLine().equalsIgnoreCase("n"))
				exit = true;
		}while(!exit);
		input.close();
		System.out.println("\tGoodbye!");
	}

}
