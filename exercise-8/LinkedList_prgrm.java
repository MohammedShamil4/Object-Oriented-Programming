// 2. Program to remove all the elements from a linked list
import java.util.*;

class LinkedList_prgrm {
	public static void main(String args[]) {
	// Create a linked list.
	LinkedList<String> l1 = new LinkedList<String>();
	LinkedList<String> l2 = new LinkedList<String>();
	// Add elements to the linked list.
	l1.add("ai");
	l1.add("b");
	l1.add("c");
	l1.add("d");
	l1.add("e");
	l1.addLast("z");
	l1.addFirst("aaa");

	l1.add(1, "a");

	System.out.println("Original contents of ll: " + l1);

	
	l1.removeAll(l1);
	
	System.out.println();
	System.out.println("Contents of l1 after deletion using removeAll() method: " + l1);

	

	// Add elements to the linked list.
	l2.add("ab");
	l2.add("bc");
	l2.add("cd");
	l2.add("de");
	l2.add("ef");
	l2.addLast("yz");
	l2.addFirst("a");

	l2.add(1, "a");
	System.out.println();
	System.out.println("Original contents of l: " + l2);

	
	l2.clear();
	
	System.out.println();
	System.out.println("Contents of l2 after deletion using clear() method: " + l2);

	
	}
	}




/* output

Original contents of ll: [aaa, a, ai, b, c, d, e, z]

Contents of l1 after deletion using removeAll() method: []

Original contents of l: [a, a, ab, bc, cd, de, ef, yz]

Contents of l2 after deletion using clear() method: []
*/


