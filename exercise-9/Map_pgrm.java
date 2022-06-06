//Program to demonstrate the working of Map interface by adding, changing and removing elements.

import java.util.*;

class Map_pgrm {
	public static void main(String args[]) {

		HashMap<Integer, String> hm1= new HashMap<Integer, String>();

		// Inserting the Elements
		hm1.put(new Integer(1), "Java");
		hm1.put(new Integer(2), "Python");
		hm1.put(new Integer(3), "C");
		hm1.put(new Integer(4), "Python");
		
	
		System.out.println("working of hashmap intial values: ");
                System.out.println(hm1);
		hm1.put(new Integer(3), "Mysql");
		System.out.println(" hashmap-----> changing  value of integer(3): ");
		System.out.println(hm1);
		hm1.remove(new Integer(4));
		System.out.println(" hashmap---->after removing key and value (4,python): ");
		System.out.println(hm1);
	


}
}

/* output

working of hashmap intial values: 
{1=Java, 2=Python, 3=C, 4=Python}
 hashmap-----> changing  value of integer(3): 
{1=Java, 2=Python, 3=Mysql, 4=Python}
 hashmap---->after removing key and value (4,python): 
{1=Java, 2=Python, 3=Mysql}

*/
