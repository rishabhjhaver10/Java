import java.util.ArrayList;
//class demonstrates various functions on arraylist
public class BMIArrayList {
	public static void main(String args[]){
		ArrayList<BMICalculator> arrayBMI = new ArrayList<BMICalculator>();
		BMICalculator bmiObj =  new BMICalculator();
		BMICalculator bmiObj2 = new BMICalculator();
		
		//to demostrate add method of ArrayList
		arrayBMI.add(bmiObj);//adding one BMI Calculator to ArrayBMI, as array is of BMI Calculator type
		arrayBMI.add(bmiObj2);
		
		//see how many elements an array are there now
		int counter = 0;
		for(int i = 0; i<arrayBMI.size();i++){
			counter++;
		}
		System.out.println("Adding functionality : There are "+counter+ " objects in arrayList");
	
		//to demonstrate how to remove and object
		arrayBMI.remove(1);//remove(index) specifies at which index value to remove element
		
		//see how many elements an array are there now
		//reset counter
		counter = 0;
		for(int i = 0; i<arrayBMI.size();i++){
			counter++;
		}
		System.out.println("There are "+counter+ " objects in arrayList after removing ");
		
		//to get size of arrayList
		System.out.println("Size of ARRAYlist IS "+arrayBMI.size());
		
		//to get object at first position 
		for(int i = 0; i<arrayBMI.size();i++){
			System.out.println("GET functionality: Display object: "+arrayBMI.get(0).toString());
		}
		
		//to see if arrayList contains an object 
		boolean value = arrayBMI.contains(bmiObj2);//we have already deleted bmiObj2
		//contains returns true or false 
		System.out.println("CONTAINS functionality: Does it contain second object that we already deleted before?: "+value);
		
	}//end of main
}//end of class
