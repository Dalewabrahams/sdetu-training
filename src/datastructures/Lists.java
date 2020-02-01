package datastructures;

import java.awt.List;
import java.util.ArrayList;

public class Lists {
	
	public static void main(String[] args) {

		// Lists - data does not need to be unique. you can have duplicate data.
		//ArrayList<String> cities = new ArrayList<String>();
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Durban");
		cities.add("Cape Town");
		cities.add("Johanessburg");
		cities.add("PMB");
		
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		int size = cities.size();
		System.out.println("There are " + size + " number of elements");
		
		System.out.println("Value at at index 1 is " + cities.get(1));
		
		
		String deletedCity = cities.get(0);
		cities.remove(0);
		System.out.println("Removed at index 0 which was " + deletedCity );
		
		//List<String> citiesSorted = new List<String>(cities);
		for (String city : cities) {
			System.out.println(city);
		}
		
		//citiesSorted
		System.out.println("\n\n");
		
		System.out.println("Sorted Array : " + cities);
		
		
		System.out.println("\n\n");
		System.out.println(cities);
	}

}
