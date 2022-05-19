/*
Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range.
Implement using threads. (Runnable Interface)
*/

import java.util.*;

public class Thread2
{

	public static void main(String args[])
	{

		Scanner in=new Scanner(System.in);
		System.out.println("----Fibonacci and Even Numbers----");       

		Runnable r = new Fibonacci();
		Thread t = new Thread(r);
		t.start();
       
		Runnable r2 = new EvenNumbers();
		Thread t2 = new Thread(r2);
		t2.start();
       
	}
}

class Fibonacci implements Runnable
{

	public void run()
	{
		try
		{
			int a=0, b=1, c=0, n=10;
			System.out.println("Fibonacci Series: " +a+ " ");
			System.out.println("Fibonacci Series: " +b+ " ");
			c = a+b;
			n = n-2;
			while(n>0)
			{
				System.out.println("Fibonacci Series: " +c+ " ");
				a = b;
				b = c;
				c = a+b;
				n--;
				Thread.sleep(500);
			}
       
       
		}
		catch(InterruptedException e)
		{
			System.out.println("error:");
		}
   
	}
}

class EvenNumbers implements Runnable
{
	public void run()
	{
		try
		{
       
			for(int i=0;i<11;i++)
			{
				if(i%2 == 0)
				{
					System.out.println(i+" is even number ");
					Thread.sleep(1000);
				}
       
			}      
		}
		catch(InterruptedException e)
		{
			System.out.println("error:");
		}
   
	}
}



/*
OUTPUT:
----Fibonacci and Even Numbers----
Fibonacci Series: 0
0 is even number
Fibonacci Series: 1
Fibonacci Series: 1
Fibonacci Series: 2
2 is even number
Fibonacci Series: 3
Fibonacci Series: 5
4 is even number
Fibonacci Series: 8
Fibonacci Series: 13
6 is even number
Fibonacci Series: 21
Fibonacci Series: 34
8 is even number
10 is even number
*/
