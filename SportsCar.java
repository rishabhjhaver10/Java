public class SportsCar {

	//Instance variables
	private CarType make; //enum type
	private CarColor color;//enum type
	private double price;

	//Constructor
	public SportsCar (CarType m, CarColor c, double p) {
		make = m;
		color = c;
		price = p;
	}

	//Get methods
	public CarType getMake() {
		return make;
	}
	public CarColor getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}

	public String toString() {
		return String.format("%s: %s\n%s: %s\n%s: $%.2f\n",
			"Make",getMake(), "Color",getColor(),
			"Price",getPrice() ); 
	}
}