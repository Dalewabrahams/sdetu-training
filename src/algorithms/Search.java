package algorithms;

public class Search {

	
	public static String linearSearch(int[] dataSet, int target) {
	
	for(int i=0; i<dataSet.length;i++) {
		if(dataSet[i] == target) {
			return "LINEAR SEARCH : Target of " + target + " was found at index " + i; // return the position. once returned, no need to break
		}
	}
	return "Target of " + target + " NOT FOUND"; // return the position. once returned, no need to break
	}
	
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		int midpoint = (int) Math.floor((start+end)/2);  // like finding the average
		int valueAtMidpoint = dataSet[midpoint];
		
	    System.out.println("Searching between " + dataSet[start] + " and " + dataSet[end] + ".  Mipoint value is " + valueAtMidpoint + " and target value is : " + target);
	    
	    
	    // uses recursion below
	    if (target > valueAtMidpoint) {
	    	return binarySearch(dataSet, target, midpoint + 1, end);
	    	
	    }
	    else if (target < valueAtMidpoint) {
	    	return binarySearch(dataSet, target, start, midpoint - 1);
	    }
	    return midpoint; // index of midpoint
	//	return -1; // if not found
	}
	
	
}
