/*
Author: Justin Garnica
Date: 9/25/2018

Total cost of driving using distance, miles per gallon and price per gallon
*/
import java.util.Scanner;

class Ex_2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();	
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}