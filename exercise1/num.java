
/*program to read a floating-point number and if the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,00,000
*/

import java.util.*;

class num{
public static void main(String args[]){

Scanner in = new Scanner(System.in);
System.out.print("Enter the value: ");
double input = in.nextDouble();

if(input > 0)	//if entered value is greater than zero
{
	if(input < 1)	
	{
		System.out.println("Positive small number");
	}

	else if(input > 100000)		
	{
		System.out.println("Positive large number");
	}
	else
	{
		System.out.println("Positive number");
	}
}
else if(input < 0)	//if entered value is less than zero
{
	if(Math.abs(input) < 1)		
	{
		System.out.println("Negative small number");
	}
	else if(Math.abs(input) > 100000)	
	{
		System.out.println("Negative large number");
	}
	else
	{
		System.out.println("Negative number");
	}
}
else             // entered value is zero
{
	System.out.println("Zero");
}
}
}



/*

Output:

	 Enter the value: 25
	 Positive number

	 Enter the value: -25
	 Negative number

	 Enter the value: 200000
	 Positive large number

	 Enter the value: -200000
	 Negative large number

	 Enter the value: 0
	 Zero

        Enter the value: -0.3
        Negative small number

        Enter the value: 0.4
        Positive small number

*/
