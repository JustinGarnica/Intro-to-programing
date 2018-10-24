/*
Author: Justin Garnica
Date: 10/24/2018

determine the area of a pentagon
*/
import java.util.Scanner;

public class Ex_4_1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from the center to the vertex: ");
		double r = input.nextDouble();
		
		Double PI = Math.PI;
		
		double SIDE = (2 * r * Math.sin(PI / 5));
		
		final double AREA = 
			((5 * Math.pow(SIDE, 2.0)) / 
			(4 * Math.tan(PI/5)));
		
		System.out.println("The Area of the pentagon is: " + AREA);
	}
}
				
		
		