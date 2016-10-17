package ibcs;

import java.util.ArrayList;
import java.util.Scanner;

public class CentralTendency {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grades one by one. When you're finished, type 'done'.");
		ArrayList<Double> grades = new ArrayList<Double>();
		int numOfNums = 0;
		while (true) {
			String enteredNum = input.nextLine();

			// makes the user add a minimum of 5 grades
			if (enteredNum.equalsIgnoreCase("done") && numOfNums >= 5)
				break;
			else if (enteredNum.equalsIgnoreCase("done") && numOfNums < 5) {
				System.out.println("Please enter at least 5 grades.");
				continue;
			}

			// If the user does not type either "done" or a number, call them
			// out and continue
			try {
				grades.add(Double.parseDouble(enteredNum));
				numOfNums++;
			} catch (Exception e) {
				System.out.println("\tPlease enter a Number, or Type 'done' to finish.");
			}
		}

		input.close();
		grades = sortList(grades);
		double mean = findMean(grades);
		String classAverage;
		System.out.println("\nThe median is: " + findMedian(grades));
		System.out.println("The mean is: " + mean);

		// Find the average letter grade for the entire class
		if (mean < 60)
			classAverage = "f";
		else if (mean < 63)
			classAverage = "D-";
		else if (mean < 67)
			classAverage = "D";
		else if (mean < 70)
			classAverage = "D+";
		else if (mean < 73)
			classAverage = "C-";
		else if (mean < 77)
			classAverage = "C";
		else if (mean < 80)
			classAverage = "C+";
		else if (mean < 83)
			classAverage = "B-";
		else if (mean < 87)
			classAverage = "B";
		else if (mean < 90)
			classAverage = "B+";
		else if (mean < 93)
			classAverage = "A-";
		else if (mean < 97)
			classAverage = "A";
		else
			classAverage = "A+";

		System.out.println("The class average is a " + classAverage);
	}

	/**
	 * Sorts the list into smallest to largest doubles.
	 * 
	 * @param a
	 *            The ArrayList that contains the grades added
	 * @return
	 */
	private static ArrayList<Double> sortList(ArrayList<Double> a) {
		ArrayList<Double> output = new ArrayList<Double>();
		double lowestVal;
		int lowestIndex = 0;
		while (a.size() > 0) {
			lowestVal = a.get(0);
			for (int k = 0; k < a.size(); k++)
				if (a.get(k) <= lowestVal) {
					lowestVal = a.get(k);
					lowestIndex = k;
				}
			a.remove(lowestIndex);
			output.add(lowestVal);
		}
		return output;
	}

	/**
	 * Finds the mean of the data set in the ArrayList entered
	 * 
	 * @param a
	 *            The ArrayList that contains the grades added
	 * @return
	 */
	private static double findMean(ArrayList<Double> a) {
		double mean = 0;
		double sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		mean = sum / a.size();
		return mean;
	}

	/**
	 * Finds the median of the data set entered
	 * 
	 * @param a
	 *            The ArrayList that contains the grades added
	 * @return
	 */
	private static double findMedian(ArrayList<Double> a) {
		double median = 0;
		ArrayList<Double> b = new ArrayList<Double>();
		for (int i = 0; i < a.size(); i++)
			b.add(a.get(i));

		while (b.size() > 0) {
			if (b.size() == 1) {
				median = b.get(0);
				break;
			} else if (b.size() == 2) {
				median = (b.get(0) + b.get(1)) / 2;
				break;
			} else {
				b.remove(b.size() - 1);
				b.remove(0);
			}
		}
		return median;
	}

}
