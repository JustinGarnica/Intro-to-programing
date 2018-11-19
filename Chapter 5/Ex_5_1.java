/*
Author: Justin Garnica
Date: 11/19/2018

Count positive and negative numbers and compute the average of numbers
*/
import java.util.Scanner;

public class Ex_5_1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int negative_numbers = 0;
		int positive_numbers = 0;
		int number_0 = 0;
		int number_sum = (negative_numbers + positive_numbers + number_0);
		
		System.out.print("Enter a positive or negative number: ");
		int number = input.nextInt();
		number_sum++;
		
		if (number > 0) {
			positive_numbers++;
		}else if (number < 0) {
			negative_numbers++;
		}else {
			number_0++;
		}
		
		while (number != 0) {
			System.out.print("Enter a positive or negative number (0 to quit): ");
			number = input.nextInt();
		
			if (number > 0) {
				positive_numbers++;
			}else if (number < 0) {
				negative_numbers++;
			}else {
				number_0++;
			}
			number_sum++;
		}
		
		System.out.println("Positive Numbers: " + positive_numbers);
		System.out.println("Negative Numbers: " + negative_numbers);
		System.out.println("The total is " + number_sum);
		
		
	}
}