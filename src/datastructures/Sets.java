package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> animals = new TreeSet<String>();
		
		// Sets only accept unique values. No duplicates
			// HastSet       --> will return your data in random order	
			// LinkedHashSet --> is the order in which they were entered
			// TreeSet 		 --> returns data in sorted order ie re-arranges to natural order
		
		animals.add("dog");
		animals.add("snake");
		animals.add("dolphin");
		animals.add("pig");
		
		System.out.println(animals.size() + " " +  animals);
		 
		animals.add("dog");
		animals.add("snake");
		animals.add("dolphin");
		animals.add("hen");
		
		System.out.println(animals.size() +  " animals : " +  animals);
		 
		// new set 
		Set<String> farmAnimals = new HashSet<String>();
		
		//farmAnimals.add("pig");
		farmAnimals.add("turtle");
		farmAnimals.add("rooster");
		farmAnimals.add("hen");
		
		System.out.println("\n\n" + farmAnimals.size() +  " farmAnimals : " +  farmAnimals);
		
		Set<String> intersectSet = new HashSet<String>(animals);
		
		// intersect or only retain from whatever is passed in (only animals and farmAnimals | AND)
		System.out.println("intersectSet : " + intersectSet);
		intersectSet.retainAll(farmAnimals);
		//System.out.println("intersect of animals and farm animals is : " +  intersectSet);
		
		
		// what is the union (in both animals and farmAnimals  | OR)
		Set<String> unionAll = new HashSet<String>(farmAnimals);
		unionAll.addAll(animals);
		System.out.println(unionAll.size() + " unionAll : " + unionAll);
		
		
		// what is the different ie in a vin diagram, its in the circle but not in the inner circle
		// in animals but not in farm animals
		Set<String> diff = new HashSet<String>(animals);
		diff.removeAll(farmAnimals);
		System.out.println(diff.size() + " diff : " + diff);
		
	}

}
