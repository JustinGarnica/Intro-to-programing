/*
Author: Justin Garnica
Date: 2/7/2019

Solve the locker puzzle.
*/

class Ex_7_23 {
	public static void main(String[] args) {
		boolean[] locker = new boolean[101];
		int student = 1;
		while (student < 101) {
			for (int i = 0; i < locker.length; i++){
				if (i % student == 0) {
					locker[i] = !locker[i];
				} 
			}
			student++;
		}
		System.out.print("The following lockers are open:");
		for (int i = 0; i < 101; i++){
			if (locker[i] == true) {
				System.out.print(" L" + i);
			}
		}
	}
}
