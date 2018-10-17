/*
Author: Justin Garnica
Date: 10/17/2018

Compute perimiter of triangle
*/

import java.util.Scanner;

public class Ex_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three edges for a triangle:");
		System.out.print(" Edge 1 point x: ");
		double x1 = input.nextDouble();
		System.out.print(" Edge 1 point y: ");
		double y1 = input.nextDouble();
		System.out.print(" Edge 2 point x: ");
		double x2 = input.nextDouble();
		System.out.print(" Edge 2 point y: ");
		double y2 = input.nextDouble();
		System.out.print(" Edge 3 point x: ");
		double x3 = input.nextDouble();
		System.out.print(" Edge 3 point y: ");		
		double y3 = input.nextDouble();

		boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
							 (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
							 (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

		if (!valid)
		{
			System.out.println("Input is invalid.");
			System.exit(1);
		}
		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

		System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
	}
}