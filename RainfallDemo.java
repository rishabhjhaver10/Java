import java.util.Scanner;

//Driver class for rainfall.java
public class RainfallDemo {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		
		Rainfall rainfall = new Rainfall();
		
		int value ;
		System.out.println("Enter a 1 to get annual rainfall for the year");
		System.out.println("Enter a 2 to get average monthly rainfall");
		System.out.println("Enter a 3 to get month with most rainfall");
		System.out.println("EEnter a 4 to get month with least rainfall");
		System.out.println("Enter 0 to quit this application");
		//user input stored in value
		value = input.nextInt();
		
		if(value<0){
			System.out.println("Sorry! Try again with a positive integer");
			value = input.nextInt();
		}
		
		while(value!=0){
			if(value==1){
				double total = rainfall.totalRainfall();
				System.out.print("Total Rainfall for the year is : "+total);
				break;
			}
			else if(value==2){
				double avg = rainfall.averageRainfall();
				System.out.println("Average monthly rainfall is : "+avg);
				break;
			}
			else if (value ==3){
				String month = rainfall.maxRainfall();
				System.out.println("Month with the max rainfall is  : "+month);
				break;
			}
			else if (value ==4){
				String month = rainfall.minRainfall();
				System.out.println("Month with the min rainfall is  : "+month);
				break;
			}
		}
		System.out.println();
		System.out.println("Bye!");
		
	}//end of main

}//end of class
