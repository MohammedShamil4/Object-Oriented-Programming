/*
Write a program to illustrate the following String manipulation
methods.
1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()
*/

import java.util.*;

class StringManipulation		//main class
{
	public static void main(String args[])		//main method
	{
		//new string using new
		char chs[] = {'w','e','l','c','o','m','e'};
		String newStr = new String(chs);
		System.out.println("New string from char[] using new String: "+newStr);

		byte asciis[] = {65, 66, 67, 68, 69, 70};
		newStr = new String (asciis);
		System.out.println("New string from byte[] using new String: "+newStr);

		String s1 = "good";
		String s2 = "Morning";

		//String length
		System.out.println("String length of 'good': "+ s1.length());

		//to uppercase and lowercase
		System.out.println("\n--------String Change--------");
		System.out.println(s1 + " to uppercase: "+ s1.toUpperCase());
		System.out.println(s2 + " to lowercase: "+ s2.toLowerCase());

		//String concatination
		System.out.println("\n--------String Concatination--------");
		System.out.println("Using concat(): "+ s1.concat(s2));
		System.out.println("Using + operator: "+ s1 + s2);

		//Character extraction
		System.out.println("\n--------Character Extraction--------");
		System.out.println("Character at 3rd position: "+ s1.charAt(3));
		char c[] = new char[5];
		s1.getChars(2,4,c,0);
		System.out.println("Character between 2 and 4 : "+ new String(c));

		//Character comparison
		System.out.println("\n--------Character Comparison--------");
		s1 = "welcome";
		s2 = "WELCOME";
		System.out.println(s1 + " Equals " + s2 + " : " + s1.equals(s2));
		System.out.println(s1 + " equalsIgnoreCase " + s2 + " : " + s1.equalsIgnoreCase(s2));

		System.out.println(s1 + " compareTo " + s2 + " : " + s1.compareTo(s2));
		System.out.println(s1 + " compareToIgnoreCase " + s2 + " : " + s1.compareToIgnoreCase(s2));

		System.out.println(s1 + " startsWith w : " + s1.startsWith("w"));
		System.out.println(s1 + " endsWith x : " + s1.endsWith("x"));

		//Search substrings
		System.out.println("\n--------Search Substrings--------");
		s1= "Have a nice day day";
		System.out.println("Index of day in "+s1+" : "+s1.indexOf("day"));
		System.out.println("Last index of day "+s1+" : "+s1.lastIndexOf("day"));

		//Modifying a string
		System.out.println("\n--------Modifying a String--------");
		s1= "Have a nice day";
		s2="    Hi    ";
		System.out.println("Substring of "+s1+" : "+s1.substring(4,11));
		System.out.println("Replace nice in "+s1+" : "+s1.replace("nice","good"));
		System.out.println("Trim "+s2+" : "+s2.trim());

		//Data conversion using valueOf()
		System.out.println("\n--------Data Conversion Using valueOf()--------");
		double dval= 3.2654;
		System.out.println("Data conversion using valueOf in "+dval+" : "+String.valueOf(dval));


	}
}




/*
OUTPUT:
New string from char[] using new String: welcome
New string from byte[] using new String: ABCDEF
String length of 'good': 4
--------String Change--------
good to uppercase: GOOD
Morning to lowercase: morning
--------String Concatination--------
Using concat(): goodMorning
Using + operator: goodMorning
--------Character Extraction--------
Character at 3rd position: d
Character between 2 and 4 : od
--------Character Comparison--------
welcome Equals WELCOME : false
welcome equalsIgnoreCase WELCOME : true
welcome compareTo WELCOME : 32
welcome compareToIgnoreCase WELCOME : 0
welcome startsWith w : true
welcome endsWith x : false
--------Search Substrings--------
Index of day in Have a nice day day : 12
Last index of day Have a nice day day : 16
--------Modifying a String--------
Substring of Have a nice day :  a nice
Replace nice in Have a nice day : Have a good day
Trim     Hi     : Hi
--------Data Conversion Using valueOf()--------
Data conversion using valueOf in 3.2654 : 3.2654
*/
