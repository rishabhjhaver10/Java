public class Circle2D
{
	private double x, y, radius;

	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public void setRadius(double r)
	{
		this.radius = r;
	}

	public double getRadius()
	{
		return radius;
	}

	public Circle2D()
	{
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}

	public Circle2D(double x, double y, double r)
	{
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	public double getPerimeter()
	{
		return (2 * Math.pi * radius)
	}

	public double getArea()
	{
		return (Math.pi * radius * radius)
	}

	public Boolean contains()
	{

	}

	public Boolean contains()
	{

	}

	public Boolean overlaps()
	{
			
	}
}