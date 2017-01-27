import java.util.Scanner;
//TempConversion.java that builds a Celsius/Fahrenheit conversion table based
//on the user input.
class TempConversion
{
	public static void main(String[] args)
	{
		//declar variables
		int number;
		double celsius;
		double farenheit;

		System.out.println("Welcome to Temperature Conversion Table");
		System.out.println("(1) Farenheit to Celsius    (2) Celsius to Farehheit");
		System.out.println("Enter your choice: ");

		//take user input
		Scanner input = new Scanner(System.in);
		number = input.nextInt();

		switch(number)
		{
			case 1:
				System.out.print("Enter the maximum temperature in Farenheit: ");
				farenheit = input.nextDouble();
				System.out.println("Farenheit  |  Celsius");
				System.out.println("------------------------");
				if(farenheit >= 0) {
					for(double i = 0; i <= farenheit; i=i+5)
					{
						celsius = (5.0/9.0) * (i - 32);
						System.out.printf("%10.2f|%10.2f",i, celsius);
						System.out.println();
					}
				} else {
					for(double i = 0; i >= farenheit; i=i-5)
					{
						celsius = (5.0/9.0) * (i - 32);
						System.out.printf("%10.2f|%10.2f",i, celsius);
						System.out.println();
					}
				}
				break;

			case 2:
				System.out.print("Enter the maximum temperature in Celsius: ");
				celsius = input.nextDouble();
				System.out.println("Celsius   |   Farenheit");
				System.out.println("------------------------");
				if(celsius >=0) {
					for(double i = 0; i <= celsius; i=i+5)
					{
						farenheit = (9.0/5.0) * i + 32;
						System.out.printf("%10.2f|%12.2f",i, farenheit);
						System.out.println();
					}
				} else {
					for(double i = 0; i >= celsius; i=i-5)
					{
						farenheit = (9.0/5.0) * i + 32;
						System.out.printf("%10.2f|%12.2f",i, farenheit);
						System.out.println();
					}
				}
				break;
			default:
				System.out.println("Invalid input");

		}//end of switch statement


	}//end of main
}//end of class
