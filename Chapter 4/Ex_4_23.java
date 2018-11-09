/*
Author: Justin Garnica
Date: 10/30/2018

Tells the payroll of any person
*/
import java.util.Scanner;

public class Ex_4_23{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
				
		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();
				
		System.out.print("Enter hourly rate: $");
		double wage = input.nextDouble();
				
		System.out.print("Enter federal tax withholding rate: ");
		double federal_tax = input.nextDouble();
		
		System.out.print("Enter state tax withholing rate: ");
		double state_tax = input.nextDouble();
				
		double grosspay = (wage * hours);
		double totaltax = ((
		state_tax + federal_tax) * grosspay);
		double netpay = (grosspay - totaltax);
				
		System.out.println("\nEmployee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + wage);
		System.out.println("Gross pay: " + grosspay);
		System.out.println("Deductions: ");
		System.out.println("\tFederal Withholding: " + federal_tax);
		System.out.println("\tState Withholding: " + state_tax);
		System.out.printf("\t Total Deduction: $%.2f", totaltax);
		System.out.printf("\n Net Pay: $%.2f", netpay);
				
				
				

	}
}