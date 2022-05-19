package Graphics;
import java.util.*;

interface Area2
{
	void area();
}

public class Triangle implements Area2
{
	double s1,s2,s3;
	public Triangle(double s1,double s2,double s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
      
	public void area()
	{
		double s=(s1+s2+s3)/2;
		double ar=Math.sqrt((s-s1)+(s-s2)+(s-s3));
		System.out.println("Area of triangle : "+ar);
	}
}
