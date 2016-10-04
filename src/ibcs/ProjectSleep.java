package ibcs;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ProjectSleep {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your Birthday:");
		System.out.print("\tMonth: ");
		String month = input.nextLine();
		System.out.print("\tDay: ");
		int day = input.nextInt();
		System.out.print("\tYear: ");
		int year = input.nextInt();
		int yearsOld = 2016 - year;
		String monthShort = month.substring(0, 3);
		monthShort = monthShort.toLowerCase();
		int monthNum = 0;

		switch (monthShort) {
		case "jan":
			monthNum = 1;
			break;
		case "feb":
			monthNum = 2;
			break;
		case "mar":
			monthNum = 3;
			break;
		case "apr":
			monthNum = 4;
			break;
		case "may":
			monthNum = 5;
			break;
		case "jun":
			monthNum = 6;
			break;
		case "jul":
			monthNum = 7;
			break;
		case "aug":
			monthNum = 8;
			break;
		case "sep":
			monthNum = 9;
			break;
		case "oct":
			monthNum = 10;
			break;
		case "nov":
			monthNum = 11;
			break;
		case "dec":
			monthNum = 12;
			break;
		default:
			System.out.println("It didn't work!");
		}
		int[] birthDay = {monthNum, day, year};
		
		int[] currentDate = { 
				Calendar.getInstance().get(Calendar.MONTH) - 1,
				Calendar.getInstance().get(Calendar.DAY_OF_MONTH), 
				Calendar.getInstance().get(Calendar.YEAR) };
		
		int[] difference = new int[3];
		for(int i = 0; i < 3; i++){
			
		}
	}

}
