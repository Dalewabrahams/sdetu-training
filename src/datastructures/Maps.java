package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// implement map interfaces
		// Map uses key/value interface while lists and arrays use indexes.
		
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		
		// HashMap 		--> returns data in random order
		// LinkedHashMap --> returns data in the order in which it was entered
		// TreeHas 		 --> returns data in a natural sorted way
		
		mapUtils(hMap);
		
		
	}
	
	public static void mapUtils(Map<Integer, String> map) {
		// add key/values
		map.put(548, "Debbie");
		map.put(101, "Rob");
		map.put(74, "James");
		map.put(99, "Peter");
		map.put(700, "Samie");
		
		
		// expose or print
		System.out.println("the key of the map is : " + map.keySet());
		System.out.println("the  value combo is : " + map.values());
		System.out.println("the key/value combo is : " + map);
		
		// iterating through key/values sets
		
		System.out.println(map.get(101));
		
		for(int key : map.keySet()) {
			  System.out.println("KEY [" + key + "] is : " +  map.get(key) );
		}
		
	}

}
