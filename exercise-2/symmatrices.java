//read 2 matrix from console and perform addition operation
import java.util.*;
class symmatrices
 {
    public static void main(String args[])
        {
           int m, n;
           int i, j;  
         
           Scanner sc=new Scanner(System.in);   
           System.out.print("Enter the number of rows: ");   
           m = sc.nextInt();   
           System.out.print("Enter the number of columns: ");    
           n = sc.nextInt();

           int array[][] = new int[m][n];    //array1
           int arr[][] = new int[m][n];      //array2
           int ar[][] = new int[m][n];       //array3
   
            //inserting elements into array 1
            System.out.println("Enter the elements of the array-1: ");   
            for (i = 0; i < m; i++)    
            for (j = 0; j < n; j++)   
            array[i][j] = sc.nextInt();  
  
            //inserting elements into array 2
            System.out.println("Enter the elements of the array-2: ");     
            for (i = 0; i < m; i++)    
            for (j = 0; j < n; j++)   
            arr[i][j] = sc.nextInt();  
 
            // display array 1
            System.out.println("Elements of the array1 are: ");   
            for (i = 0; i < m; i++){   
            for (j = 0; j < n; j++)
            System.out.print(array[i][j] + " ");   
            System.out.println();   
           } 
            // display array 2
            System.out.println("Elements of the array2 are: ");   
            for (i = 0; i < m; i++){   
            for (j = 0; j < n; j++)    
            System.out.print(arr[i][j] + " ");   
            System.out.println();
          }
            // addition of 2 array
            for (i = 0; i < m; i++)     
            for (j = 0; j < n; j++)  
            ar[i][j]=arr[i][j] + array[i][j]; 
            System.out.println("Sum of the matrix is");
            
            // display resultant array
            for (i = 0; i < m; i++){   
            for (j = 0; j < n; j++)  
            System.out.print(ar[i][j]+ " ");   
            System.out.println();   
          }
        }     
}


/* OUTPUT

Enter the number of rows: 3
Enter the number of columns: 3
Enter the elements of the array-1: 
1
0
1
0
2
0
3
0
3
Enter the elements of the array-2: 
2
0
2
1
0
3
1
2
3
Elements of the array1 are: 
1 0 1 
0 2 0 
3 0 3 
Elements of the array2 are: 
2 0 2 
1 0 3 
1 2 3 
Sum of the matrix is
3 0 3 
1 2 3 
4 2 6 

*/
//Verified
