/*
Author: Justin Garnica
Date: 10/17/2018

Determine whether or not a point is located in a rectangle centered at (0,0) with height of 5 and width 10.  
*/
import java.util.Scanner;

public class Ex_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" Enter a point with two coordinates: ");
		System.out.print(" x: ");
		double x = input.nextDouble();
		System.out.print(" y: ");
		double y = input.nextDouble();

		boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) &&
										  (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2 ) &&
										(Math.pow(Math.pow(x, 2), 0.5) >= -10 / 2 ) &&
											 (Math.pow(Math.pow(y, 2), 0.5) >= -5.0 / 2);

		System.out.println("Point (" + x + ", " + y + ") is " +
			((withinRectangle) ? "in " : "not in ") + "the rectangle");
	}
}