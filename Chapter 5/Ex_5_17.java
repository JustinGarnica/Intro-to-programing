/*
Author: Justin Garnica
Date: 11/9/2018

Make a number pyramid
*/
import java.util.Scanner;

public class Ex_5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number of rows here (1 - 15): ");
			int rows = input.nextInt();
			
			while (rows < 1 || rows > 15) {
				System.out.print("Enter number of rows here (1 - 15): ");
				rows = input.nextInt();

			}
			
			for (int r = 1; r <= rows; r++) {

				for (int spaces = 1; spaces <= (rows - r); spaces ++) {
					System.out.print("   ");
				}

				for (int left = r; left >= 1; left--) {
					System.out.printf("%3d", left);
				}
				
				for (int right = 2; right <= r; right++) {
					System.out.printf("%3d", right);
				}
				
				System.out.println();
			}
		
		
		
	}
}