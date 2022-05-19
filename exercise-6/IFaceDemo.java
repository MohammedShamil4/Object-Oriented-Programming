/*
Create an interface having prototypes of functions area() and perimeter().
Create two classes Circle and Rectangle which implements the above interface.
Create a menu driven program to find area and perimeter of objects.
*/




import java.util.*;

interface AP
{
	void input();
	void perimeter();
	void area();
}

class Circle implements AP
{
	int r = 0;
	double pi = 3.14, ar = 0, peri = 0;
	public void input()
	{
		r = 5;
	}
	public void area()
	{
		ar = pi*r*r;
		System.out.println("Area of circle : "+ar);
	}
	public  void perimeter()
	{
		peri = 2*pi*r;
		System.out.println("Perimeter of circle : "+peri);
	}
}

class Rectangle extends Circle
{
	int l = 0, b = 0;
	double ar, peri;
	public void input()
	{
		super.input();
		l = 4;
		b = 2;
	}
	public void area()
	{
		super.area();
		ar = l*b;
		System.out.println("Area of rectangle : "+ar);
	}
	public void perimeter()
	{
		super.perimeter();
		peri = 2*(l+b);
		System.out.println("Perimeter of rectangle : "+peri);
	}
}

public class IFaceDemo
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		do{
			Scanner ch = new Scanner(System.in);
			System.out.println("\n1. Area\n2. Perimeter\n3. Exit\nChoose an option : ");
			int a = ch.nextInt();
			switch(a)
			{
				case 1:
					obj.input();
					obj.area();
					System.out.println("-------------------------------");
					break;
				case 2:
					obj.input();
					obj.perimeter();
					System.out.println("-------------------------------");
					break;

				default:
					System.out.println("Enter valid input");
					System.out.println("Exiting......");
					System.exit(0);
					break;
			}
		}while(true);
   

	}
}





/*
OUTPUT:
1. Area
2. Perimeter
3. Exit
Choose an option : 
1
Area of circle : 78.5
Area of rectangle : 8.0
-------------------------------
1. Area
2. Perimeter
3. Exit
Choose an option : 
2
Perimeter of circle : 31.400000000000002
Perimeter of rectangle : 12.0
-------------------------------
1. Area
2. Perimeter
3. Exit
Choose an option : 
3
Enter valid input
Exiting......
*/
