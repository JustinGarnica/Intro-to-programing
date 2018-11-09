/*
Author: Justin Garnica
Date: 11/9/2018

Print all numbers that are multiples of 5 or 6, but not both between 100 and 200
*/
import java.util.Scanner;

public class Ex_5_11 {
	public static void main(String[] args) {

		int count = 1;
		for (int i = 100; i <= 200; i++) {
			if (i % 6 == 0 ^ i % 5 == 0) {
				System.out.print((count++ % 10 != 0) ? i + " " : i + "\n");

			}
		}
	}
}