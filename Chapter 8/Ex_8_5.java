/*
Author: Justin Garnica
Date: 2/15/2019

Add Matricies.
*/
import java.util.Scanner;

class Ex_8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] c = new double[3][3];
		
		System.out.print("enter 9 numbers for matrix A: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				a[row][col]= input.nextDouble();
			}
		}
		
		System.out.print("enter 9 numbers for matrix B: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				b[row][col]= input.nextDouble();
			}
		}
		c = addMatrix(a, b);
		for (double[] row : c) {
			for (double col : row) {
				System.out.print(col + " ");
			}
		System.out.println();
		}
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		
		for (int r = 0; r < c.length; r++) {
			for (int i = 0; i < c[0].length; i++) {
				c[r][i] = a[r][i] + b[r][i];
			}
		}
	return c;
	}
}