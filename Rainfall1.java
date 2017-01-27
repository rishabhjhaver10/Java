public class Rainfall
{
	double[] rainfall = {100.1, 293.6, 54.56, 636.87, 251.07, 44.28, 187.04, 94.60, 33.41, 1852.2, 2.1, 17.3};
	String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public double totalRainfall()
	{
		double totalRainfall = 0.0;
		for(double i : rainfall)
		{
			totalRainfall += i;
		}
		return totalRainfall;
	}

	public double averageRainfall()
	{
		double averageRainfall = totalRainfall()/12;
		return averageRainfall;
	}

	public String maxRainfall()
	{
		double max = rainfall[0];
		String mon = "";
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] > max)
			{
				max = rainfall[i];
				mon = month[i];
			}

		}
		return mon;
	}

	public String minRainfall()
	{
		double min = rainfall[0];
		String mon = "";
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] < min)
			{
				min = rainfall[i];
				mon = month[i];
			}
			
		}
		return mon;
	}

}