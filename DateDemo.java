public class DateDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String choice = '';

		Date d1 = new Date();
		Date d2 = new Date(1, 1, 2000);
		Date d3 = new Date("January", 1, 2000)
		Date d4 = new Date(1, 2000);

		System.out.println("Choose the date format: a, b, or c");
		choice = input.nextLine();

		formatDate(choice);
	}
}