/*
Author: Justin Garnica
Date: 9/25/2018

Output result of savings total after 6 months
*/
import java.util.Scanner;

class Ex_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MONTHLY_INTEREST_RATE = 0.00417;
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
		double total = savingAmount * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the sixth month, the account value is " + total);				
	}
}