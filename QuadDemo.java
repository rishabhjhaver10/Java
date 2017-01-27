import java.util.Scanner;

public class QuadDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a : " );
		int a = input.nextInt();
		System.out.println("Enter the value of b : " );
		int b = input.nextInt();
		System.out.println("Enter the value of c : " );
		int c = input.nextInt();

		QuadraticEquation qe = new QuadraticEquation(a, b, c);

		System.out.println("The value of Discriminant is : " +
								 qe.getDiscriminant());

		if(qe.getDiscriminant() > 0)
			System.out.println("The roots are : " + qe.getRoot1() +
			                     ", " + qe.getRoot2());

		else if(qe.getDiscriminant() == 0)
			System.out.println("The root is : " + qe.getRoot1());

		else
			System.out.println("The equation has no roots.");

	}
}