//this class is used to implement basic concept of a balloon
public class Balloon {
	//create a new variable
	private double radius ;
	
	public Balloon(){
		//no argument constructor
		setRadius(0.0);
	}
	
	//method to setRadius
	public void setRadius(double r){
		radius = r;
	}
	
	//method to get Radius
	public double getRadius(){
		return radius;
	}
	
	//method to inflate
	public void inflate(double amount){
		//cause it says to increase the amount
		radius += amount;
	}
	
	//method to getVolume
	public double getVolume(){
		double volume = (4*(Math.PI*Math.pow(getRadius(),3)))/3;
		return volume;
		
	}
}
