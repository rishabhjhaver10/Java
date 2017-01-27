import java.lang.Math;

public class QuadraticEquation
{
	private int a, b, c;

	public QuadraticEquation(int a, int b, int c)
	{
		setA(a);
		setB(b);
		setC(c);
	}

	public void setA(int a)
	{
		this.a = a;
	}

	public void setB(int b)
	{
		this.b = b;
	}

	public void setC(int c)
	{
		this.c = c;
	}

	public int getA()
	{
		return a;
	}

	public int getB()
	{
		return b;
	}

	public int getC()
	{
		return c;
	}

	public int getDiscriminant()
	{
		return ((b*b) - (4*a*c));
	}

	public double getRoot1()
	{
		if(getDiscriminant() >= 0)
			return ((-b + Math.sqrt(getDiscriminant()) / (2*a)));
		else
			return 0;
	}

	public double getRoot2()
	{
		if (getDiscriminant() >= 0)
			return ((-b - Math.sqrt(getDiscriminant()) / (2*a)));
		else
			return 0;
	}

}	