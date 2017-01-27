//Program to use args parameter
//Calculator.java

public class Calculator {
	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Enter in the format a + b");
			System.exit(0);
		}

		int result = 0;

		char operator = args[1].charAt(0);

		switch(operator) {
			case '+':
				result = Integer.parseInt(args[0]) +
				Integer.parseInt(args[2]);
				break;
			case '-':
				result = Integer.parseInt(args[0]) -
				Integer.parseInt(args[2]);
				break;
			case '.':
				result = Integer.parseInt(args[0]) *
				Integer.parseInt(args[2]);
				break;
			case '/':
				try {
					result = Integer.parseInt(args[0]) /
					Integer.parseInt(args[2]);
				}
				catch(ArithmeticException ae) {
					System.out.println(ae);
				}
				break;
			default:
				System.out.println("Invalid operator");
				break;

		} //end switch

		System.out.println(args[0] + args[1] + args[2] + " = " +
			result);
	}//end main
}//End class


