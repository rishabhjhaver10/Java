import java.util.Scanner;
import java.util.ArrayList;
//inflates balloons and add it in an array
public class BalloonArray 
{
	static int counter = 0;
	static ArrayList<String> Balloons = new ArrayList<String>();

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Scanner input2  = new Scanner(System.in);
		System.out.println("Do you want to enter radius of baloon? Enter '0' to add Balloon and enter anything else to exit");
		int value = input2.nextInt();

		while(value == 0)
		{
			System.out.println("Enter radius of next balloon: ");
			double radius = input.nextDouble();
			createBalloon(radius);
			System.out.println("Do you want to enter radius of baloon? Enter '0' or '1'");
			value = input2.nextInt();
		}
		displayBalloons();
	}//end of main


	public static void createBalloon(double size)
	{
		Balloon b = new Balloon();
		b.inflate(size);
		double vol = b.getVolume();
		counter++;
		Balloons.add(counter + "," + size + "," + vol);
	}

	public static void displayBalloons()
	{
		System.out.println("Balloon Radius Volume");
		for(int i =0 ; i< Balloons.size();i++)
			System.out.println(Balloons.get(i));
	}
}//end of class
