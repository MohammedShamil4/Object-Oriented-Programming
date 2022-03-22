/*program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order"otherwise.
*/

import java.util.*;

class sort{

public static void main(String args[])
{
 Scanner m=new Scanner(System.in);
 System.out.println("enter the  three number : ");
 int a=m.nextInt();
 int b=m.nextInt();
 int c=m.nextInt();
  
 if (a < b && b < c) //checking condition a<b<c
 {
   System.out.println(" increasing order");
 }
 else if(a > b && b > c )   //checking condition a>b>c
 {
  System.out.println(" decreasing order");
 }
 else // if both above condition are wrong
 {
  System.out.println("non sequential order");
 }
}
}


/* OUTPUT
enter the  three number :
2
4
5
 increasing order

enter the  three number : 
2
1
5
non sequential order

enter the  three number : 
9
5
2
 decreasing order
*/

