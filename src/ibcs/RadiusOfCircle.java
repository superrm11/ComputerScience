package ibcs;

import java.util.Scanner;

public class RadiusOfCircle {

	public static void main(String[] args) {
		System.out.println("Please input the area of the circle: _");
		Scanner input = new Scanner(System.in);
		double area = input.nextDouble();
		double radius = Math.sqrt(area/Math.PI);
		System.out.println("The radius is: " + radius);
		input.close();
	}

}
