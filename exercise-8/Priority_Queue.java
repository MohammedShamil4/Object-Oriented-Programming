// Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.*;

	public class Priority_Queue{
		public static void main(String args[]){

		PriorityQueue<String> queue=new PriorityQueue<String>();

		queue.add("sanan");
		queue.add("shamil");
		queue.add("reema");
		queue.add("aneetha");
		System.out.println("Queue elements are : ");
		System.out.println(queue);
		
		
	
		
		}
	}

/* output

Queue elements are : 
[aneetha, reema, sanan, shamil]

*/
