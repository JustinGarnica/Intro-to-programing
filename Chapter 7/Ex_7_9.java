/*
Author: Justin Garnica
Date: 2/1/2019

find the minimum number in a list of ten. 
*/
import java.util.Scanner;

class Ex_7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.print("Enter 10 numbers seperated by a space: ");
		for ( int i = 0; i < 10; i++){
			array[i] = input.nextDouble();
		}
		double min = min(array);
		System.out.print("The minimum number is: " + min);
	}
	public static double min(double[] array){
		double min = array[0];
		
		for(int i = 1; i < 10; i++){
			if (min > array[i]){
				min = array[i];
			}
		}
		return min;
	}
}