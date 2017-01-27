public class Date
{
	private int mon, day_m, year, day_y;
	private String month;

	public Date()
	{
		mon = 1;
		month = "January";
		day_m = 1;
		year = 1991;
		day_y = 1;
	}

	public Date(int m, int d, int y)
	{
		setMon(m);
		setDay(d);
		setYear(y);

	}

	public Date(String m, int d, int y)
	{
		setMonth(m);
		setDay(d);
		setYear(y);
	}

	public Date(int dy, int y)
	{
		setDayYear(dy);
		setYear(y);
	}
	public void setMon(int mon) 
	{
		this.mon = mon;	
	}

	public void setMonth(String month) 
	{
		this.month = month;	
	}

	public void setDay(int day_m) 
	{
		this.day_m = day_m;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public void setDayYear(int day_y) 
	{
		this.day_y = day_y;
	}

	//Get methods
	public int getMon() 
	{
		return mon;
	}

	public String getMonth()
	 {
		return month;
	}


	public int getDay() 
	{
		return day_m;
	}

	public int getYear() 
	{
		return year;
	}

	public int getDayYear() 
	{
		return day_y;
	}

	public void formatDate(String s)
	{
		if(s == "a")
		{
			System.out.println("%2d/%2d/%4d", getMon(), getDay(), getYear());
		}

		else if(s == "b")
		{
			System.out.println("%2s %2d, %4d", getMonth(), getDay(), getYear());
		}

		else if(s == "c")
		{
			System.out.println("%2d %4d", getDayYear(), getYear());
		}
	}
}
