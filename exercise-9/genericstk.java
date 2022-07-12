//Program to create a generic stack and do the Push and Pop operations.



import java.util.*;
class Stack<T> {
     private ArrayList<T> elements;                    // Empty array list
     public Stack( int capacity ){                        // Constructor of this class To initialize stack
         elements = new ArrayList<T>(capacity);                     // Creating array of Size = capacity
     } 
     public void push(T element) {                                 // Method 1 To push generic element into stack
         elements.add(element);
     }
     public T pop() {                                              // Method 2 To push generic element into stack
         return elements.remove(elements.size()-1);
     }
 }    
public class genericstk {
     public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("\n----------------------Integer stack------------------------");
  	System.out.println("\nEnter size of  stack");
	int n1=sc.nextInt();
	Stack<Integer> s1=new Stack<>(n1);
	System.out.println("\nenter elements ");					//to add elements to Stack
	for(int i=0;i<n1;i++){
		int elements=sc.nextInt();
		s1.push(elements);
	}
	System.out.println("\nEnter no of elements to pop :");
	int n2=sc.nextInt();
   	for(int j=0;j<n2;j++){
		int p1 = s1.pop();							//to pop elements
		System.out.println("The poped Element is: " + p1);	
	}
	System.out.println("\n-----------------------String stack--------------------------");
        System.out.println("\nEnter size of  stack");
	int n3=sc.nextInt();
	Stack<String> s2 = new Stack<String>(n3);
	System.out.println("\nEnter elements ");
	for(int i=0;i<=n3;i++)
	{
		String selements=sc.nextLine();							//to  add elements to Stack
		s2.push(selements);
	}
	System.out.println("\nEnter no of elements to pop :");
	int n4=sc.nextInt();
   	for(int j=0;j<n4;j++)
	{
		String p2 = s2.pop();							//to pop elements
		System.out.println("The poped value is: " + p2);	
	}
  }
}


/*
OUTPUT:
----------------------Integer stack------------------------
Enter size of  stack
4
enter elements
1
2
3
4
Enter no of elements to pop :
2
The poped Element is: 4
The poped Element is: 3
-----------------------String stack--------------------------
Enter size of  stack
4
Enter elements
a
b
c
d
Enter no of elements to pop :
1
The poped value is: d
*/