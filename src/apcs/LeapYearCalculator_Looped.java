package apcs;

import java.util.Scanner;

public class LeapYearCalculator_Looped {

	/**
	 * @author Ryan McGee
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String command;
		int year;
		System.out.println("Please enter a year: ");
		while (true) {
			System.out.print(":>");
			command = input.nextLine();
			if(command.equals("exit")){
				break;
			}else{
				year = Integer.parseInt(command);
			}
			if (year < 1582) {
				input.close();
				throw new Exception();
			}
			if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
				System.out.println(year + " IS a leap year.");
			} else {
				System.out.println(year + " is NOT a leap year.");
			}
			
			System.out.println("Enter another year or type 'exit' to exit.");
		}
		input.close();
	}

}
