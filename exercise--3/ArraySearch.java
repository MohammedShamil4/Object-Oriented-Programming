/*
Write a program to search an element in an array using
a) linear search
b) simple binary search
c) recursive binary search
d) using Arrays .binarySearch ()
*/


import java.util.*;
class ArraySearch{

	 int linear(int arr[],int item,int len){  //method for linear search
		int j=0;
		while(j<len){
			if(arr[j]==item){
				return j;
			}
			j++;
		}
		return -1;
		
	
	
	}
	int binary(int arr[],int item,int low,int high){   	//method for binary search
		while(low<=high){
			int mid=low+(high-low)/2;
			
			if(arr[mid]==item){
				return mid;
			
			}
			else if(arr[mid]<item){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	
	}
	int recursiveBinarySearch(int arr[],int item,int low,int high){		//method for recursiveBinarySearch search
		
		if(low<=high){
		
			int mid=low+(high-low)/2;
			if(arr[mid]==item){
				
				return mid;
				
			}
			else if(arr[mid]<item){
				return recursiveBinarySearch(arr,item,mid+1,high);
			}
			else{
				return recursiveBinarySearch(arr,item,low,mid-1);							
			}
		}
		return -1;
	
	}
	
	
	
	
	
	
	public static void main(String args[]){			//main method
		Scanner ob =new Scanner(System.in);			//scanner object
		ArraySearch s= new ArraySearch();			//object for class ArraySearch
		System.out.print("Enter no.of elements in the array: ");
		int n= ob.nextInt();
		int array[]=new int[n]; 		 //initialise array 
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
		
			array[i]=ob.nextInt();
		
		}
		Arrays.sort(array);
		System.out.println("\n-------------------------------");
		
		System.out.print("Enter the element to search: ");
		int item=ob.nextInt();
		System.out.println("\n-------------------------------");
		
		System.out.println("Linear Search: ");
		int result=s.linear(array,item,n);
		if(result==-1){
			System.out.println("Item NotFound...!");
		}
		else{
			System.out.println("Item Found at index position:	"+result);
		}
		System.out.println("\n-------------------------------");
		
		
		
		System.out.println("Binary Search:");
		int result1=s.binary(array,item,0,n-1);
		
		if(result1==-1){
			System.out.println("Item NotFound...!");
		}
		else{
			System.out.println("Item Found at index position: "+result1);
		}
		
		
		System.out.println("\n-------------------------------");
		
		System.out.println("Recursive Binary Search: ");
		
		int result2=s.recursiveBinarySearch(array,item,0,n-1);
		
		if(result2==-1){
			System.out.println("Item NotFound...!");
		}
		else{
			System.out.println("Item Found at index position: "+result2);
		}
		System.out.println("\n------------------------------");
		
		
		System.out.println("Using Arrays.binarySearch(): ");
		int result3=Arrays.binarySearch(array,item);
		System.out.println("Item Found at index position: "+result3);
		
		
		
		
	
	}


}


/*
OUTPUT:
Enter no.of elements in the array: 3
Enter the elements:
2
3
4
-------------------------------
Enter the element to search: 2
-------------------------------
Linear Search:
Item Found at index position:   0
-------------------------------
Binary Search:
Item Found at index position: 0
-------------------------------
Recursive Binary Search:
Item Found at index position: 0
------------------------------
Using Arrays.binarySearch():
Item Found at index position: 0
*/