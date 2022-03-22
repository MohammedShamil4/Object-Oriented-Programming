//a program in Java to display the cube of the number up to a given integer


import java.util.*;

class cube{

 public static void main(String args[])
  {
   Scanner m=new Scanner(System.in);
   System.out.print("enter the number : ");
   int n=m.nextInt();
   for(int i=0;i<=n;i++)
    {
      int s=i*i*i;         //to find cube
      System.out.println("cube of "+i+" = "+s);
    }
  }
}

/* OUTPUT
enter the number : 6
cube of 0 = 0
cube of 1 = 1
cube of 2 = 8
cube of 3 = 27
cube of 4 = 64
cube of 5 = 125
cube of 6 = 216
*/
