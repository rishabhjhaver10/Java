public class CircleDriver
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for point (x,y): ");
		System.out.println("Enter the value of x-coordinate of the point: ");
		double x = input.nextDouble();
		System.out.println("Enter the value of y-coordinate of the point: ");
		double y = input.nextDouble();
		System.out.println("The point is" + "(" + x + ", " + y + ")");
		System.out.println("Enter the value of radius: ");
		double r = input.nextDouble();

		Circle2D c2d = new Circle2D(x, y, r);

		System.out.println("The area of circle is: " + c2d.getArea());
		System.out.println("The perimeter of ciecle is: " + c2d.getPerimeter());

		System.out.println("Enter the values for a new point (a,b): ");
		System.out.println("Enter the value of x-coordinate of the point: ");
		double a = input.nextDouble();
		System.out.println("Enter the value of y-coordinate of the point: ");
		double b = input.nextDouble();
		System.out.println("The point is" + "(" + a + ", " + b + ")");

		System.out.println("Enter the coordinates of center and radius for a new circle:");
		System.out.println("Enter the value of x-coordinate of the point: ");
		double c = input.nextDouble();
		System.out.println("Enter the value of y-coordinate of the point: ");
		double d = input.nextDouble();
		System.out.println("The point is" + "(" + c + ", " + d + ")");
		System.out.println("Enter the value of radius: ");
		double r1 = input.nextDouble();

		Circle2D c2d1 = new Circle2D(c, d, r1);
	}
}