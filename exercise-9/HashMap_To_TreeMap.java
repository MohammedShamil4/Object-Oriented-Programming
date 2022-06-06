/* Program to Convert HashMap to TreeMap

Map<String, String> treeMap = new TreeMap<>(); treeMap.putAll(map);
Or
Map<String, String>sorted = new TreeMap<String, String>(map);
*/


import java.util.*;

public class HashMap_To_TreeMap 
{
	public static void main(String args[]) 
	{
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		System.out.println("HashMap = " + map);
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.putAll(map);
		System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);
	}
}

