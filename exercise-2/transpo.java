//read matrix from console and check symmetric or not
import java.util.*;
class transpo
 {
    public static void main(String args[])
        {
           int m, n;
           int i=0, j=0; 
           boolean symmetric = true; 
         
           Scanner sc=new Scanner(System.in);   
           System.out.print("Enter the number of rows: ");   
           m = sc.nextInt();   
           System.out.print("Enter the number of columns: ");    
           n = sc.nextInt();

           int array[][] = new int[m][n];    //array1
           int arr[][] = new int[m][n];      //array2
          
   
            //inserting elements into matrix
            System.out.println("Enter the elements of the matrix : ");   
            for (i = 0; i < m; i++)    
            for (j = 0; j < n; j++)   
            array[i][j] = sc.nextInt();  

            // display matrix 1
            System.out.println("Elements of the matrix are: ");   
            for (i = 0; i < m; i++){   
            for (j = 0; j < n; j++)
            System.out.print(array[i][j] + " ");   
            System.out.println();   
           }  
            for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
            if (array[i][j]!=array[j][i])
              {
                  symmetric = false;
                  break;
              }
          }
          }
          if(symmetric)
            {
                System.out.println("The given matrix is symmetric...");
            }
            else
            {
                System.out.println("The given matrix is not symmetric...");
            }
     }
}



/* OUTOUT

Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the matrix: 
1
2
2
1
Elements of the matrix are: 
1 2 
2 1 
The given matrix is symmetric...

*/
