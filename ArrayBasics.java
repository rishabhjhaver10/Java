//Program ArrayBasics

public class ArrayBasics {
	public static void main(String[] args) {

		//Create an array of type in
		int[] numbers = new int[10]; //0 to 9

		//Print array
		for (int i=0; i<10; i++)
			System.out.print(numbers[i] + ", ");

		/*
		//int numbers[] = {1,2,3,4,5,5}

		int x, y, z;
		int[] a, b, c;

		int a[], b, c;
		*/

		String [] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};


		for(int i=0; i<numbers.length; i++)
			numbers[i] = i*i;

		for(int i=0; i<=numbers.length-1; i++)
			System.out.println(numbers[i] + ", ");
		System.out.println();

		System.out.println("Array size: " +numbers.length);

		int sum = 0;
		for(int x : numbers) 
			sum += x;
		
		System.out.println("Sum = " +sum);

		System.out.println("Average: " +sum/numbers.length);

		for(String weekDay : week)
			System.out.println(weekDay);

		System.out.println();
		
	}
}