// Write a Java program to compare two hash set

	import java.util.*;
	public class Hashset_cmp {
	public static void main(String[] args) {
	
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		System.out.println("set 1 elements : "+h_set);

		HashSet<String>h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		System.out.println("set 2 elements : "+h_set2);

		HashSet<String> h_set3 = new HashSet<String>();
		h_set3.add("Red");
		h_set3.add("Green");
		h_set3.add("Black");
		h_set3.add("White");
		System.out.println("set 3 elements : "+h_set3);

		boolean value= h_set.equals(h_set2);
		System.out.println("Are both hashset1 and hashset2 equal: "+ value);

		boolean values= h_set.equals(h_set3);
		System.out.println("Are both hashset1 and hashset3 equal: "+ values);
	
		}
	}

/* output

set 1 elements : [Red, White, Black, Green]
set 2 elements : [Red, Pink, Black, Orange]
set 3 elements : [Red, White, Black, Green]
Are both hashset1 and hashset2 equal: false
Are both hashset1 and hashset3 equal: true

*/
