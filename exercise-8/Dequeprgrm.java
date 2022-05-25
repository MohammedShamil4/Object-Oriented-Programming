//Program to demonstrate the addition and deletion of elements in deque

import java.util.*;

	public class Dequeprgrm{

		public static void main(String[] args) {

		//Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Anand");
		deque.add("Aswin");
		deque.add("Alan");
		
		System.out.println("Deque elements are : "+deque);
		System.out.println();
		deque.remove();
		System.out.println("Deque elements after removing  : "+deque);
		System.out.println();
		deque.remove();
		System.out.println("Deque elements after removing  : "+deque);
		
		}
	 }

/* OUTPUT

Deque elements are : [Anand, Aswin, Alan]

Deque elements after removing  : [Aswin, Alan]

Deque elements after removing  : [Alan]

*/
