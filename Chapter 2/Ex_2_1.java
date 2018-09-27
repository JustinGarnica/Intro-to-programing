/*
Author: Justin Garnica
Date: 9/25/2018

Output result of celcius to fahrenheit

*/
import java.util.Scanner;

class Ex_2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a degree in Celcius:");
		double celsius = input.nextDouble();
		double fahrenheit = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " Degrees Celsius is " + fahrenheit + " Degrees Fahrenheit"); 		
	}
}