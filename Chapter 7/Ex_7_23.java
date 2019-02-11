/*
Author: Justin Garnica
Date: 2/7/2019

Solve the locker puzzle.
*/

class Ex_7_23 {
	public static void main(String[] args) {
		Boolean[] locker = new Boolean[100];
		int student = 1;
		while (student <= 100) {
			for (int i = 0; i < locker.length; i++){
				if (i % student == 0) {
					locker[i] = !locker[i];
				} 
			student++;
			}
		}
		System.out.print("The following lockers are open:");
		for (int i = 0; i < 100; i++){
			if (locker[i] == true) {
				System.out.print(" L" + locker[i]);
			}
		}
	}
}
