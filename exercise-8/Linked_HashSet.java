//Program to demonstrate the creation of Set object using the Linked Hashset class

import java.util.*;
	
	public class Linked_HashSet{
		public static void main(String args[]){
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("aswin");
		set.add("shamil");
		set.add("reema");
		set.add("aneetha");
		set.add("aneetha");

		System.out.println(" Linked Hashset-----> elements are :");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){

		System.out.println(itr.next());

					}
		}
	 }

/* output

Linked Hashset-----> elements are :
aswin
shamil
reema
aneetha

*/
