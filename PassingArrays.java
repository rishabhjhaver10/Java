//Passing arrays to methods
//PassingArrays.java

public class PassingArrays {
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5};

		System.out.println("Address of array1: " +array1);
		System.out.println("Element 2 before calling the method");
		System.out.println(array1[2]);

		printArray(array1);

		System.out.println("Element 2 after calling the method");
		System.out.println(array1[2]);

	}

	public static void printArray (int[] array2) {

		System.out.println("Address of array2: " +array2);

		for(int item: array2)
			System.out.print(item + ", ");
		System.out.println();

		array2[2] = 8;
	}
}