// Group 17
// Name: Sidharth Mehra UTA Id: 1001246532
// Name: Aishwarya Jagath Naik UTA Id: 1001171557
// Name: Rishabh Sandeep Jhaveri UTA Id: 1001235720
import java.util.Scanner;
public class ProductSales
{
	public static void main(String[] args)
	{
		//Scanner declaration
		Scanner input = new Scanner(System.in);

		//Variable Initialization
		int product_number;
		int quantity_sold;
		double product_cost;
		double total_cost=0;
		Boolean test = true;
		String str = " ";
		do
		{
			System.out.print("Enter the product number (1-5): ");
			product_number = input.nextInt();
			if(product_number < 1 || product_number > 5)
			{
					System.out.println("Invalid product number. Enter a number between 1 and 5: ");
					product_number = input.nextInt();
			}
			else
			{
				System.out.println("The product number is " + product_number);
			}

			System.out.print("Enter the quantity: ");
			quantity_sold = input.nextInt();

			switch(product_number)
			{
				case 1:
					product_cost = 2.98;
					total_cost += product_cost * quantity_sold;
					break;
				case 2:
					product_cost = 4.50;
					total_cost += product_cost * quantity_sold;
					break;
				case 3:
					product_cost = 9.98;
					total_cost += product_cost * quantity_sold;
					break;
				case 4:
					product_cost = 4.49;
					total_cost += product_cost * quantity_sold;
					break;
				case 5:
					product_cost = 6.87;
					total_cost += product_cost * quantity_sold;
					break;
		  }

			System.out.print("Would you like to buy another product? (yes/no): ");
			str = input.next();

		} while(str.equals("yes"));
		System.out.printf("\nTotal value of all products sold: %.2f\n",total_cost);
	}

}
