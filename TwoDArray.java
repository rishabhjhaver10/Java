import java.util.Scanner;
public class TwoDArray
{
	public static void main(String[] args)
	{
		int[][] numberArray = new int[9][11];
		// Write a statement that assigns 145 to the 2nd column of the array (use loop).
		for(int i=0;i<9;i++){
			numberArray[i][1]=145;
		}
		// Write a statement that assigns 18 to the cell at 4th column of the last row of this array.
		numberArray[8][3]=18;
		// Write a statement that assigns 22 to the 5th row of the array (use loop)
		for(int i=0;i<11;i++){
			numberArray[4][i]=22;
		}
		// Write a statement that assigns 83 to the cell at 7th row and 9th column.
		numberArray[6][8]= 83;

	}//end of main
}//end of class
