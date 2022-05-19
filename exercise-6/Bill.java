//Prepare bill using calculate method from interface.

import java.util.* ;
interface BillGen{
	int calculate( ) ;
}
class ProductB implements BillGen {
	String name ;
	int prodid , quantity , unitprice , total ;
	ProductB ( ){}
	ProductB( String n , int p , int q , int u){
		name = n ; 
		prodid = p ;
		quantity = q ;
		unitprice = u ;
	}
	public int calculate ( ) {
		total = quantity * unitprice ;
		return total ;
	}
}
public class Bill {
	public static void main ( String [ ] args ) {
		ProductB [ ] [ ] order ;
		System.out.println ("Enter no. of orders : " ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int n = sc.nextInt ( ) ;
		order = new ProductB[n][ ] ;
		for ( int i = 0 ; i < n ; i++){
			System.out.println();
			System.out.println("Enter order "+ (i+1) +" details");
			System.out.println("----------------------");
			System.out.print("Enter no. of Products : " ) ;
			int m = sc.nextInt ( ) ;
			order[i] = new ProductB[m] ;
			for (int j = 0 ; j < m; j++ ){
				System.out.print ("Enter Product " + (j+1) + " Name : " ) ;
				String a = sc.next ( ) ;
				System.out.print("Enter Product ID: " ) ;
				int b = sc.nextInt ( ) ;
				System.out.print ("Enter Product Quantity : " ) ;
				int c = sc . nextInt ( ) ;
				System.out.print ("Enter Product Unit Price : " ) ;
				int d = sc .nextInt ( ) ;
				ProductB pb = new ProductB ( a , b , c , d ) ;
				order [ i ] [ j ] = pb ;
				order [ i ] [ j ] . total = order [ i ] [ j ] . calculate ( ) ;
			}
		}
		for(int i = 0 ; i < n ; i++){
			int sum = 0 ;
			System.out.println("Order No : " + ( i +1) ) ;
			Date date=java.util.Calendar.getInstance() . getTime ( ) ;
			System.out.println( date ) ;
			System.out.println("__________________________________________________________________________________________");
			System.out.printf ("%5s %20s %25s %10s %10s " ,"ProdId " ,"Name" , "Quantity " , " Unit Price " ," Total " ) ;
			System.out.println ( ) ;
			System.out.println("__________________________________________________________________________________________");
			for( int j =0; j<order [ i ] . length ; j++){
				System.out.printf ("%5s %20s %25s %10s%10s " ,order[i][j].prodid ,order [ i ] [ j ] . name ,	order [ i ] [ j ] . quantity ,
				order [ i ] [ j ] . unitprice ,order [ i ] [ j ] . total ) ;
				System.out.println ( ) ;
			}
			System.out.println("___________________________________________________________________________________________");
			for ( int k=0; k<order [i] . length ; k++)
				sum = sum + order[i] [k] . total ;
			System.out.println ("Net Amount : " + sum) ;
			System.out.println("___________________________________________________________________________________________");
			}
		}
}



/*
OUTPUT:
Enter no. of orders : 
2
Enter order 1 details
----------------------
Enter no. of Products : 1
Enter Product 1 Name : A
Enter Product ID: 101
Enter Product Quantity : 2
Enter Product Unit Price : 25
Enter order 2 details
----------------------
Enter no. of Products : 1
Enter Product 1 Name : B  
Enter Product ID: 102
Enter Product Quantity : 1
Enter Product Unit Price : 100
Order No : 1
Tue May 10 14:41:12 IST 2022
__________________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
__________________________________________________________________________________________
  101                    A                         2         25        50 
___________________________________________________________________________________________
Net Amount : 50
___________________________________________________________________________________________
Order No : 2
Tue May 10 14:41:12 IST 2022
__________________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
__________________________________________________________________________________________
  102                    B                         1        100       100 
___________________________________________________________________________________________
Net Amount : 100
___________________________________________________________________________________________
*/
