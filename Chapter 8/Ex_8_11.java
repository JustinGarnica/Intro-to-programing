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
		int num = input.nextInt();
		//int subNum = 256; 
		String newNum = Integer.toString(num, 2);
		for (int i = 0; i <= 9; i++) {
			int length = newNum.length();
			if (length < 9) {
				newNum = "0" + newNum;
			}
		}
		for (int i = 0; i < 9; i++) {
			newNum.substring(i) = fullnum(i);
		}
		System.out.println(newNum);
		biNum[0][0] = fullNum0;
		biNum[0][1] = fullNum1;
		biNum[0][2] = fullNum2;
		biNum[1][0] = fullNum3;
		biNum[1][1] = fullNum4;
		biNum[1][2] = fullNum5;
		biNum[2][0] = fullNum6;
		biNum[2][1] = fullNum7;
		biNum[2][2]	= fullNum8;
				
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