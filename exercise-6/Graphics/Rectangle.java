package Graphics;
import java.util.*;

interface Area1
{
	void area();
}

public class Rectangle implements Area1
{
	double l,b;
	public Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
      
	public void area()
	{
		double ar=l*b;
		System.out.println("Area of rectangle : "+ar);
	}
}
