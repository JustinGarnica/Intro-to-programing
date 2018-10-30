		/*
		Author: Justin Garnica
		Date: 10/26/2018

		determine the amount of days in a month
		*/
		import java.util.Scanner;

		public class Ex_4_17{
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a Year: ");
			int year = input.nextInt();
			
			System.out.print("Enter the first 3 letters of a Month: ");
			String month = input.next();
			
			boolean isLeapYear =(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
			if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
				System.out.println("There are 31 days in " + month + " in " + year + ".");
			} else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
				System.out.println("There are 30 days in " + month + " in " + year + ".");
			} else if (month.equals("Feb") && isLeapYear == true) {
				System.out.println("There are 29 days in " + month + " in " + year + ".");
			} else {
				System.out.println("There are 28 days in " + month + " in " + year + ".");

			}
				

	}
}