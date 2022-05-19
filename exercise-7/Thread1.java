/*
Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers.
Implement using threads. (Thread class)
*/

import java.util.*;

public class Thread1
{
	public static void main(String args[])
	{

		Scanner in=new Scanner(System.in);
		System.out.println("----Prime Numbers and Multiplication of 5----");

		Runnable r = new Multiplication();
		Thread t = new Thread(r);
		t.start();
       
		Runnable r2 = new PrimeNumbers();
		Thread t2 = new Thread(r2);
		t2.start();
       
	}
}

class Multiplication implements Runnable
{
	public void run()
	{
		try
		{

			for(int i=1;i<10;i++)
			{
         
				System.out.println("Multiplication table of "+i+" * 5 = "+i*5);
				Thread.sleep(200);
			}
 
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}  
	}
}

class PrimeNumbers implements Runnable
{
	public void run()
	{
		try
		{
			int i, j, c;
     
			for(i=2; i<=50; i++)
			{
				c= 0;
				for(j=2; j<i; j++)
				{
					if(i%j==0)
					{
						c++;
						break;
					}
				}
				if(c==0)
				{
					System.out.println(i+" is prime number ");
             			Thread.sleep(100);
				}
				
			}
   
		}
		catch(InterruptedException e)
		{
			System.out.println("Error:");
		}
	}
}



/*
OUTPUT:
----Prime Numbers and Multiplication of 5----
2 is prime number
Multiplication table of 1 * 5 = 5
3 is prime number
5 is prime number
Multiplication table of 2 * 5 = 10
7 is prime number
Multiplication table of 3 * 5 = 15
11 is prime number
13 is prime number
Multiplication table of 4 * 5 = 20
17 is prime number
19 is prime number
Multiplication table of 5 * 5 = 25
23 is prime number
29 is prime number
Multiplication table of 6 * 5 = 30
31 is prime number
37 is prime number
Multiplication table of 7 * 5 = 35
41 is prime number
43 is prime number
Multiplication table of 8 * 5 = 40
47 is prime number
Multiplication table of 9 * 5 = 45
*/
