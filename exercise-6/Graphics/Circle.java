package Graphics;
import java.util.*;

interface Area4
{
	void area();
}
public class Circle implements Area4
{
	double r;
	double pi=3.14, ar=0;
	public Circle(double r)
	{
		this.r=r;
	}
      
	public void area()
	{
		ar=pi*r*r;
		System.out.println("Area of circle : "+ar);
	}
}
