package apcs.unit_three_programs;

import java.util.Scanner;

public class IntegerSum {

	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an Integer: ");
		int num = input.nextInt();
		int constant = 0;
		for(int i = 0; i <= num; i+=2){
			constant+=i;
		}
		input.close();
		System.out.println(constant);
		
		
	}

}
