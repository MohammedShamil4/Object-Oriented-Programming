package Graphics;
import java.util.*;

interface Area3
{
	void area();
}

public class Square implements Area3
{
	double a;
	public Square(double a)
	{
		this.a=a;
	}
      
	public void area()
	{
		double ar=a*a;
		System.out.println("Area of square : "+ar);
	}
}
