import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FillArrays {
	public static void main(String args[]){
		
		//declaration and initialization of arrays
		ArrayList<Integer> randomArray = new ArrayList<Integer>();
		
		//any random number upto this range
		int range = 20;
		
		for(int i =0; i < range; i ++){
			int random = (int )(Math.random() * 100 + 1);
			randomArray.add(random);
		}
	
		//display this random number array
		for(int i : randomArray){
			System.out.println("Elements of ramdonArray is "+i); 
		}
		///////////////////////////////////////////////////////
		
		//unique random numbers
		
		Set<Integer> uniqueRandomArray =new HashSet<Integer> ();
		for(int i =0; i < range; i ++){
			Random r = new Random();
			int randomUnique =  r.nextInt(100);
			uniqueRandomArray.add(randomUnique);
		}
		System.out.println("--------------------------------------------");
		
		for(int i : uniqueRandomArray){
			System.out.println("Elements of a unique ramdonArray  is "+i) ;
		}
		
		
	}//end of main
}//end of FillArrays.java
