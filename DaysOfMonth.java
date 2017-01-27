// Group 17
// Name: Sidharth Mehra UTA Id: 1001246532
// Name: Aishwarya Jagath Naik UTA Id: 1001171557
// Name: Rishabh Sandeep Jhaveri UTA Id: 1001235720

import java.util.Scanner;

//The program computes the number of days in the specified month.
public class DaysOfMonth
{
	public static void main(String args[])
	{
		//create scanner object
		Scanner input = new Scanner(System.in);

		//declare variables to hold input from user
		int year;
		int month;
		int daysInMonth = 0;
		boolean isLeapYear;
		String monthName = " ";

		//get user input
		System.out.print("Please enter a month (1-12): ");
		month = input.nextInt();

		System.out.print("Please enter a year: ");
		year = input.nextInt();

		//check if year is a leap year
		isLeapYear = (year%100 != 0 && year%4 == 0) ||(year%400==0);


		//if month is feb, and if its a leap year, assign 29 else 28
		if(month == 2 )
			if(isLeapYear == true)
				daysInMonth = 29;
			else
				daysInMonth = 28;

		else if (month == 4 || month == 6 || month == 9 || month == 11)
			daysInMonth = 30;

		else
			daysInMonth = 31;

		switch(month)
		{
			case 1:
				monthName = "January";
				break;

			case 2:
				monthName = "February";
				break;

			case 3:
				monthName = "March";
				break;

			case 4:
				monthName = "April";
				break;

			case 5:
				monthName = "May";
				break;

			case 6:
				monthName = "June";
				break;

			case 7:
				monthName = "July";
				break;

			case 8:
				monthName = "August";
				break;

			case 9:
				monthName = "September";
				break;

			case 10:
				monthName = "October";
				break;

			case 11:
				monthName = "November";
				break;

			case 12:
				monthName = "December";
				break;

		}
		System.out.println("Number of days in " + monthName + ", " + year + ": " + daysInMonth + " days");
	}
}
