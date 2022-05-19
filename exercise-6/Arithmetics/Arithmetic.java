package Arithmetics;
import java.util.*;

interface Operations
{
	void addition();
	void subtraction();
	void multiplication();
	void division();
}

public class Arithmetic implements Operations
{
	
	double a;
	double b;
	double c;
	public Arithmetic(double a,double b)
	{
	this.a=a;
	this.b=b;
	}

	public void addition()
	{
		c=a+b;
		System.out.println("addition result "+c);
	}
	public void subtraction()
	{
		c=a-b;
		System.out.println("subtraction result "+c);
	}
	public void multiplication()
	{
		c=a*b;
		System.out.println("multiplication result "+c);
	}
	public void division()
	{
		c=(a/b);
		System.out.println("division result "+c);
	}
}
