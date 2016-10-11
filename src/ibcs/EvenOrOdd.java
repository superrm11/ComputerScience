package ibcs;

import java.util.Scanner;

public class EvenOrOdd {
	/**
	 * @author Ryan McGee
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input an Integer: ");
		int i = input.nextInt();
		if(i % 2 == 0){
			System.out.println(i + " is even.");
		}else{
			System.out.println(i + " is odd.");
		}
		input.close();
	}

}
