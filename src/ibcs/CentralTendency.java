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
			
			//makes the user add a minimum of 5 grades
			if (enteredNum.equalsIgnoreCase("done") && numOfNums >= 5)
				break;
			else if(enteredNum.equalsIgnoreCase("done") && numOfNums < 5)
				System.out.println("Please enter at least 5 grades.");
			
			try {
				grades.add(Double.parseDouble(enteredNum));
				numOfNums++;
			} catch (Exception e) {
				System.out.println("\tPlease enter a Number, or Type 'done' to finish.");
			}
		}
		
		input.close();
		grades = sortList(grades);
		System.out.println("The median is: " + findMedian(grades));
		System.out.println("The mean is: " + findMean(grades));
		

	}
	/**
	 * Sorts the list into smallest to largest doubles.
	 * 
	 * @param a The ArrayList that contains the grades added
	 * @return
	 */
	private static ArrayList<Double> sortList(ArrayList<Double> a) {
		ArrayList<Double> output = new ArrayList<Double>();
		double lowestVal;
		int lowestIndex = 0;
		while(a.size() > 0){
			lowestVal = a.get(0);
			for (int k = 0; k < a.size(); k++)
				if (a.get(k) <= lowestVal){
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
	 * @param a The ArrayList that contains the grades added
	 * @return
	 */
	private static double findMean(ArrayList<Double> a){
		double mean = 0;
		double sum = 0;
		for(int i = 0; i < a.size(); i++){
			sum += a.get(i);
		}
		mean = sum / a.size();
		
		return mean;
	}
	
	/**
	 * Finds the median of the data set entered
	 * 
	 * @param a The ArrayList that contains the grades added
	 * @return
	 */
	private static double findMedian(ArrayList<Double> a){
		double median = 0;
		while(a.size() > 0){
			if(a.size() == 1){
				median = a.get(0);
				break;
			}else if(a.size() == 2){
				median = (a.get(0) + a.get(1)) / 2;
				break;
			}else{
				a.remove(a.size() - 1);
				a.remove(0);
			}
		}
		return median;
	}
	

}
