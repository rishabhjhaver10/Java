//Variable length arrays
//VarLenArray.java

public class VarLenArray {
	public static void main(String[] args) {

		int[] arr1 = {23,53,64,35,67,24};

		System.out.println("Max arr1 = " +findMax(arr1));

		int[] arr2 = {23,53,64,35};

		System.out.println("Max arr2 = " +findMax(arr2));


	} //End main

	public static int findMax(int... values) {
		int max = values[0];

		for(int i=0; i<values.length; i++) {
			if (values[i] > max)
				max = values[i];
		}

		/*
		for (int item : values) {
			if (item > max)
				max = item;
		}
		*/
		return max;
	}

}