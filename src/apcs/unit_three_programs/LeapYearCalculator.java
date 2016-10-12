package apcs.unit_three_programs;

import java.util.Scanner;

public class LeapYearCalculator {

	/**
	 * @author Ryan McGee
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a year: ");
		int year = input.nextInt();
		if(year < 1582){
			input.close();
			throw new Exception();
		}
		if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
			System.out.println(year + " IS a leap year.");
		}else{
			System.out.println(year + " is NOT a leap year.");
		}
		input.close();
	}

}
