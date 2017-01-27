//Program to test TrafficLight
public class TrafficLightDemo {
	public static void main(String[] args) {

		System.out.println("Traffic light duration");

		for(TrafficLight light : TrafficLight.values())
			System.out.printf("%12s: %3d\n",light,light.getDuration());

	}
}