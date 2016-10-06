package ibcs;

import java.util.Calendar;
import java.util.Scanner;

public class ProjectSleep {

	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your Birthday:");
		System.out.print("\tMonth: ");
		int month = input.nextInt();
		System.out.print("\tDay: ");
		int day = input.nextInt();
		System.out.print("\tYear: ");
		int year = input.nextInt();
		input.close();
		int[] birthDay = { month, day, year };
		// To get current date:
		int[] currentDate = { Calendar.getInstance().get(Calendar.MONTH) + 1,
				Calendar.getInstance().get(Calendar.DAY_OF_MONTH), 
				Calendar.getInstance().get(Calendar.YEAR) };
		
		int[] difference = new int[3];
		difference[2] = currentDate[2] - birthDay[2];
		if (currentDate[0] < birthDay[0]) {
			difference[2]--;
			difference[0] = (currentDate[0] + 12) - birthDay[0];
		} else
			difference[0] = currentDate[0] - birthDay[0];
		if (currentDate[1] < birthDay[1]) {
			difference[0]--;
			difference[1] = (currentDate[1] + 30) - birthDay[1];
		} else
			difference[1] = currentDate[1] - birthDay[1];
		int daysAlive = difference[1] + (difference[0] * 30) + ((difference[2] * 12) * 30);
		System.out.println("You have been alive for about " + daysAlive + " days.");
		System.out.println("You have slept for about " + (daysAlive * 8) + " hours.");
		
		
	}

}
