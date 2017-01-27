public class Dog
{
	private DogBreed breed;
	private DogColor color;
	private double price;

	public Dog()
	{
		breed = DogBreed.BOXER;
		color = DogColor.WHITE;
		price = 1000;
	}

	public Dog(DogBreed b, DogColor c, double p) 
	{
		setBreed(b);
		setColor(c);
		setPrice(p);
	}

	//Get methods
	public DogBreed getBreed()
	{
		return breed;
	}

	public DogColor getColor() 
	{
		return color;
	}
	public double getPrice() 
	{
		return price;
	}

	public void setBreed(DogBreed b)
	{
		breed = b;
	}

	public void setColor(DogColor c)
	{
		color = c;
	}

	public void setPrice(double p)
	{
		price = p;
	}

	public String toString()
	{
		return String.format("%s: %d\n%s: %s\n%s: %s\n%s: $%.2f\n",
			"Ordinal",breed.ordinal(),
			"Breed",getBreed(),
			"Color",getColor(),
			"Price",getPrice()); 
	}
}