/*
Author: Justin Garnica
Date: 2/22/2019

Heads or tails thingy
*/
import java.util.Scanner;

public class Ex_8_11{
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[][] biNum = new int[3][3];

		System.out.print("Enter a number between 0 and 511: ");
		int decNum = input.nextInt();
		int subNum = 256; 
		int num = decNum;

		for (int row = 0 ; row < 3; row++){
			for (int column = 0 ; column < 3; column++) {
				if(num >= subNum) {
					biNum[row][column] = 1;
					num = num - subNum;
				}
				else {
					subNum = subNum / 2;
					biNum[row][column] = 0;
				}
			}
		}
		
		for (int row = 0; row < biNum.length; row++){
			for (int column = 0; column < biNum[row].length; column++){
				if (biNum[row][column] == 1){
					System.out.print("T ");
				}
				else if (biNum[row][column] == 0){
					System.out.print("H ");
				}
				if (column == 2){
					System.out.print("\n");
				}
			}
		}
	}
}