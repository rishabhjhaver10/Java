//Array Student list

public class StudentList {
	public static void main(String[] args) {

		int classSize = 10;

		int[] studentID = new int[classSize];
		double[] height = new double[classSize];
		boolean[] check = new boolean[classSize];

		System.out.printf("%s%8s%7s\n",
		 "Student", "Height", "Check");
		
		for(int i=0; i<classSize; i++)
			System.out.printf("%5d,%9.2f,%B\n",
				studentID[i],height[i],check[i]);

		System.out.println();
	}
}

