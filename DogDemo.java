public class DogDemo
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog(DogBreed.BULLDOG,DogColor.BROWN, 1000);

		Dog d2 = new Dog(DogBreed.BOXER,DogColor.WHITE, 1200);

		Dog d3 = new Dog(DogBreed.POODLE,DogColor.BLACK, 1500);

		Dog dogArray[] = new Dog[3];

		dogArray[0] = d1;
		dogArray[1] = d2;
		dogArray[2] = d3;

		for(Dog d : dogArray)
			displayDog(d);	
	
		void displayDog(Dog dog)
		{
			String country = "";	
			switch(breed)
			{

				case BULLDOG:
				country = "United Kingdom";
				System.out.println(dog, "Country: " + country);
				break;

				case DALMATIAN:
				country = "Croatia";
				System.out.println(dog, "Country: " + country);
				break;

				case POODLE:
				country = "France";
				System.out.println(dog, "Country: " + country);
				break;

				case BOXER:
				country = "Germany";
				System.out.println(dog, "Country: " + country);
				break;
			}
		}
	}		
}