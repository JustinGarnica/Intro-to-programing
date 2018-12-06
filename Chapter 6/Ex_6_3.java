/*
Author: Justin Garnica
Date: 11/30/2018

Determine if a number is a palindrome number
*/
import java.util.Scanner;

public class Ex_6_3 {
	public static int promptUserForInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		return input.nextInt();
	}
	
	public static boolean isPalindrome(int num) {
		int rev = rev(num);
		return num == rev;
	}
	
	public static int rev(int num) {
		

		int rem = 0;
		int rev = 0;
		
		
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int userInput = promptUserForInput();
		System.out.println("Is " + userInput + " a Palindrome? " + isPalindrome(userInput));
	}

}