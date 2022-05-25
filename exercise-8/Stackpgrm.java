// Program to remove an object from the Stack when the position is passed as parameter(removeElementAt())

import java.util.*;
	public class Stackpgrm{

		public static void main(String args[]){

		Stack<String> stack = new Stack<String>();

	stack.push("Apple");
	stack.push("Grape");
	stack.push("Orange");
	stack.push("Banana");
	stack.push("Lemon");


	System.out.println("before an object is removed from stack : ");
	Iterator<String> itr=stack.iterator();
	while(itr.hasNext()){

	System.out.println(itr.next());

				}

	stack.removeElementAt(1);
	System.out.println("after removing  at position (1) of the stack : " );
	Iterator<String> itrs=stack.iterator();
	while(itrs.hasNext()){

	System.out.println(itrs.next());

				}
	}
	}


/* output

before an object is removed from stack : 
Apple
Grape
Orange
Banana
Lemon
after removing  at position (1) of the stack : 
Apple
Orange
Banana
Lemon

*/















