//Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) and static nested class RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.


import java.util.*;

class CPU		//Outer class
{

float price=5000;
     void display()
     {
       System.out.println("PRICE: "+price);
       Processor p=new Processor();		//Creating object for inner class
       p.display();
     }


	class Processor		//Inner class
	{
	int core=5;
	String man="AMD";
		void display()
    	 	{
       	System.out.println("NUMBER OF CORES: "+core);
      	 System.out.println("CPU MANUFACTERER: "+man);
		}

	}

 	static class Ram//STATIC INNER CLASS
	{
	int size=4;
	String manu="DELL";
		void display()
		{
		System.out.println("RAM SIZE: "+size+ " GB");
		System.out.println("RAM MANUFACTERER: "+manu);
		}
	}


	public static void main(String args[])
	{
	CPU obj=new CPU();			//Creating object for outer class
	System.out.println("SYSTEM INFORMATIONS");
	System.out.println("....................");
	System.out.println("\n");
	obj.display();
	CPU.Ram obj2=new CPU.Ram();		//Creating object for static inner class
	obj2.display();
	}
}



/*
OUTPUT:
SYSTEM INFORMATIONS
....................
PRICE: 5000.0
NUMBER OF CORES: 5
CPU MANUFACTERER: AMD
RAM SIZE: 4 GB
RAM MANUFACTERER: DELL
*/

