//Program to test Date.java
//DateDemo.java

public class DateDemo {
	public static void main (String[] args) {

		//Create objects of Date class
		Date d1 = new Date(); //Invokes no-arg constructor
		Date d2 = new Date(2,10,1998); //Invokes overloaded Contructor
		Date d3 = new Date(10,23);

		//Display Dates
		System.out.println(d1.toString());
		System.out.println(d2);
		System.out.println(d3);

		try{
			Date d4 = new Date(17,23,2000);
		}

		//catch (IllegalArgumentException iae) {
		catch(Exception ex ){
			System.out.println(ex.getMessage());
		
		}

		Date d5 = new Date(1,1,2016);
		Date d6 = new Date(1,1,2016);

		if (d5.toString() == d6.toString()) //Compares address
			System.out.println("d5 and d6 are same");
		else
			System.out.println("d5 and d6 are different");


		if(d5.equals(d6))
			System.out.println("d5 and d6 are same");
		else
			System.out.println("d5 and d6 are different");

	}
}