//Program to test SportsCar.java
public class SportsCarDemo {
	public static void main(String[] args) {

		SportsCar car1 = new SportsCar(
			CarType.PORSCHE,CarColor.BLUE, 100000);

		SportsCar car2 = new SportsCar(
			CarType.JAGUAR,CarColor.SILVER, 120000);

		SportsCar car3 = new SportsCar(
			CarType.FERRARI,CarColor.RED, 150000);


		//Create an array of SportsCar
		SportsCar carArray[] = new SportsCar[3];

		//Add cars to the array
		carArray[0] = car1;
		carArray[1] = car2;
		carArray[2] = car3;

		for (SportsCar car : carArray)
			System.out.println(car);

	}
}