//program to calculate BMI

import java.util.Scanner;
//class
public class BMICalculator {
	
	public static void main(String args[]){
		//create scanner object
		Scanner input  = new Scanner(System.in);
		
		//declare variable
		int weight;
		int height;
		double bmi;
		String message;
		
		System.out.print("Enter weight");
		weight = input.nextInt();
		
		System.out.print("Enter height");
		height = input.nextInt();
		
		//compute BMI
		bmi = (weight*703)/Math.pow(height, 2);
		
		message = "BMI is "+String.format("%.2f", bmi)+"\nAnd you are: ";
		
		if(bmi < 18.5){
			message+= "Underweight";
		}
		else if(bmi <25){
			message+= "normal";
		}
		else if (bmi <30){
			message+= "Overweight";
		}
		else 
			message+= "Obese";	
		
		//display message
		System.out.println(message);
		
	}//end main
}//end class
