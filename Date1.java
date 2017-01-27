//Class Date
//Date.java

public class Date {

	private int month;
	private int day;
	private int year;

	//No-argument constructor
	public Date() {
		/*
		day = 1;
		month = 1;
		year = 2000;
		*/
		/*
		setMonth(1);
		setDay(1);
		setYear(2000);
		*/

		this(1,1,2000); //Calls overloaded constructor

	}

	public Date(int m, int d, int y) {

		setMonth(m);
		setDay(d);
		setYear(y);
	}

	public Date(int m, int d) {
		setMonth(m);
		setDay(d);
		setYear(2000);
	}

	//Accessor and Mutator methods

	//Set methods
	public void setMonth(int month) {
		if (month > 0 && month < 13)
			this.month = month;
		else
			throw new IllegalArgumentException (
				"Month must be between 1-12");
	}

	public void setDay(int day) {
		if (day > 0 && day <= 31)
			this.day = day;
		else
			throw new IllegalArgumentException (
				"Day must be between 1-31");
	}

	public void setYear(int year) {
		if (year > 0)
			this.year = year;
		else
			throw new IllegalArgumentException (
				"Year must be greater than zero");

	}

	//Get methods
	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public Object clone() {
		return new Date(getMonth(),getDay(),getYear());
	}

	//Overriding toString method
	//String representation of the object
	
	public boolean equals(Object o) {
		Date id = (Date)o; //Type cast o to Date

		if ( (this.getMonth() == id.getMonth()) &&
			 (this.getDay() == id.getDay()) &&
			 (this.getYear() == id.getYear()) )

			return true;

		return false;

	}

	public String toString() {
		return String.format("%2d/%2d/%4d",
			getMonth(), getDay(), getYear());
	}
	

}//End class