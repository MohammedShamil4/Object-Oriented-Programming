/*
Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations.
Test the package by implementing all operations on two given numbers
*/

import Arithmetics.*;
import java.util.*;


class ArithmeticsOperation
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers");
                double a=in.nextDouble();
                double b=in.nextDouble();
		Arithmetic obj = new Arithmetic(a,b);
         	do{
			System.out.println("\n1.addition \n2.subtraction \n3.multiplication \n4.division \n5.exit \nChoose an option : ");
			int s=in.nextInt();
		
			switch (s)
			{
				case 1:
					obj.addition();
					break;
				case 2:
					obj.subtraction();
					break;
				case 3:                      
					obj.multiplication();
					break;
				case 4:
					obj.division();
					break;
				default :
					System.out.println("Exiting....");
					System.exit(0);
					break;
			}
		}while(true);
	}
}





/*
OUTPUT:
Enter two numbers
5
7
1.addition 
2.subtraction 
3.multiplication 
4.division 
5.exit 
Choose an option : 
1
addition result 12.0
1.addition 
2.subtraction 
3.multiplication 
4.division 
5.exit 
Choose an option : 
2
subtraction result -2.0
1.addition 
2.subtraction 
3.multiplication 
4.division 
5.exit 
Choose an option : 
3
multiplication result 35.0
1.addition 
2.subtraction 
3.multiplication 
4.division 
5.exit 
Choose an option : 
4
division result 0.7142857142857143
1.addition 
2.subtraction 
3.multiplication 
4.division 
5.exit 
Choose an option : 
5
Exiting....
*/
