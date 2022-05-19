//1. Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.*;
class Arraylist_prgrm {
	public static void main(String args[]) {
	// Create an array list.
	ArrayList<String> al = new ArrayList<String>();

	System.out.println("Initial size of al: " + al.size());

	// Add elements to the array list.
	al.add("sam");
	al.add("sem");
	al.add("mam");
	al.add("Bam");
	al.add("Dam");
	al.add("Fam");
	al.add(1, "Aim");

	System.out.println("Size of al after additions: " + al.size());

	// Display the array list.
	System.out.println("Contents of al: " + al);
	
	// Remove elements from the array list.
	al.remove("F");
	al.remove(2);

	System.out.println("Size of al after deletions: " + al.size());
	System.out.println("Contents of al: " + al);
	}
	}


/* output
Initial size of al: 0
Size of al after additions: 7
Contents of al: [sam, Aim, sem, mam, Bam, Dam, Fam]
Size of al after deletions: 6
Contents of al: [sam, Aim, mam, Bam, Dam, Fam]
*/
