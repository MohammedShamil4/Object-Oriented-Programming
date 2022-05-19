/*
Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle.
Test the package by finding the area of these figures.
*/


import java.util.*;
import Graphics.*;



class ShapesGraphics
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		double r=in.nextDouble();
		Circle obj = new Circle(r);
		System.out.println("Enter the length of rectangle : ");
		double l=in.nextDouble();
		System.out.println("enter the breadth of rectangle : ");
		double b=in.nextDouble();
		Rectangle obj1 = new Rectangle(l,b);
		System.out.println("enter the side of a square : ");
		double a=in.nextDouble();
		Square obj2 = new Square(a);
		System.out.println("enter the 3 sides of a triangle : ");
		double s1=in.nextDouble();
		double s2=in.nextDouble();
		double s3=in.nextDouble();
		Triangle obj3 = new Triangle(s1,s2,s3);

		obj.area();
		obj1.area();
		obj2.area();
		obj3.area();
		
	}
}



/*
OUTPUT:
Enter the radius of circle :
2
Enter the length of rectangle :
3
enter the breadth of rectangle :
4
enter the side of a square :
5
enter the 3 sides of a triangle :
1
2
3
Area of circle : 12.56
Area of rectangle : 12.0
Area of square : 25.0
Area of triangle : 1.7320508075688772
*/
