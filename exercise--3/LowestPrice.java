//Define a class ‘product’ with data members pcode, pname and price.
//Create 3 objects of the class and find the product having the lowest price

import java.util.*;

class Product{ 		//create a class product
	int pcode;		//variable diclaration
	double price;		
	String pname;
	void disp(){ 	 // method for display details
		
		System.out.println("Product Code: "+pcode+"\nProduct Name: "+pname+"\nProduct Price: "+price);		
	     
	}
}

public class LowestPrice { 		//main class
	public static void main(String args[]){ 	 //main function
		Scanner ob=new Scanner(System.in);
		Product p1=new Product();          //create 3 objects of Product class
		Product p2=new Product();
		Product p3=new Product();
		
		System.out.println("Enter the details of product 1");			//details of product 1
		System.out.print("\nProduct code: ");
		p1.pcode=ob.nextInt();
		System.out.print("Product Name: ");
		p1.pname=ob.next();
		System.out.print("Product Price: ");
		p1.price=ob.nextDouble();
		System.out.println("-----------------------------");
		
		
		System.out.println("Enter the details of product 2");			//details of product 2
		System.out.print("\nProduct code: ");
		p2.pcode=ob.nextInt();
		System.out.print("Product Name: ");
		p2.pname=ob.next();
		System.out.print("Product Price: ");
		p2.price=ob.nextDouble();
		System.out.println("-----------------------------");
		
		
		System.out.println("Enter the details of product 3");			//details of product 3
		System.out.print("\nProduct code: ");
		p3.pcode=ob.nextInt();
		System.out.print("Product Name: ");
		p3.pname=ob.next();
		System.out.print("Product Price: ");
		p3.price=ob.nextDouble();
		System.out.println("-----------------------------\n");
		
		
		
		if(p1.price<p2.price){		//checking for minimum priced product
	
			if(p1.price<p3.price){
				System.out.println("The product "+p1.pname+" is minimum price\n-------------------------");
				p1.disp();
			}
			else{
				System.out.println("The  product "+p3.pname+" is minimum price\n-------------------------");
				p3.disp();
			}	
		}
		else{
		 
			if(p2.price<p3.price){
				System.out.println("The  product "+p2.pname+" is minimum price\n-------------------------");
				p2.disp();
			}
			else{
				System.out.println("The  product "+p3.pname+" is minimum price\n---------------------------");
				p3.disp();
			}	
		}
		
		
	}
	

}



/*
OUTPUT:
Enter the details of product 1
Product code: 1
Product Name: Laptop
Product Price: 45000
-----------------------------
Enter the details of product 2
Product code: 2
Product Name: Phone
Product Price: 25000
-----------------------------
Enter the details of product 3
Product code: 3
Product Name: Camera
Product Price: 100000
-----------------------------
The  product Phone is minimum price
-------------------------
Product Code: 2
Product Name: Phone
Product Price: 25000.0
*/