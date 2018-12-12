/*
Author: Justin Garnica
Date: 12/12/2018

make a number with some zero's
*/
import java.util.Scanner;

public class Ex_6_37 {
	
	public static String format(int number, int width){
		String stringnum = " " + number;
		int numberlength = stringnum.length();
		if (numberlength >= width) {
			return stringnum;
		} else {
			for (int prezero = numberlength - width;) {
				System.out.print("0");
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		System.out.print("Enter a Width: ");
		int width = input.nextInt();
		
		System.out.print(format(number, width));
		return format(number, width);
	}
}