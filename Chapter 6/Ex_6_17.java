/*
Author: Justin Garnica
Date: 12/06/2018

make a matrix
*/
import java.util.Scanner;

public class Ex_6_17 {
	public static int promptUserForInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		return input.nextInt();
	}

	public static void printMatrix(int n){
		for (int i = 0; i < n; i++) {
			printRow(n);
			System.out.print("\n");
		}
	}
	public static void printRow(int length){
		for (int i = 0; i < length; i++) {
			int num = (int)Math.round(Math.random());
			System.out.print(num + " ");
		}
	}	
	public static void main(String[] args) {
		int size = promptUserForInput();
		printMatrix(size);
		
	}
}