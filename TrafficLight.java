//Enumerations
//Enums are constants
public enum TrafficLight {

	//Declare constants of type enum
	RED(45),
	AMBER(30),
	GREEN(15);

	//Instance variable
	int duration; //duration of the the signal

	//enum constructor
	TrafficLight(int time) {
		duration = time;
	}

	//Accessor method
	public int getDuration() {
		return duration;
	}
}