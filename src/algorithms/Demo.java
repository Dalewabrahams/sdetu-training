package algorithms;

public class Demo {

	public static void main(String[] args) {

		int[] numbers = {1, 54, 875, 95, 68};;
		int[] sortedArray = {1, 3, 5, 14, 17, 20, 24, 36, 40, 44, 49, 56, 58, 70, 81,88,92,93,99,103,111};
	//	int pos = (algorithms.Search.linearSearch(numbers, 95));
	//	System.out.println("position of 95 is at index " + pos);
		
		// call the linear search
		System.out.println(algorithms.Search.linearSearch(numbers, 95));
		
		// call the binary search
		int text = algorithms.Search.binarySearch(sortedArray, 58, 0, sortedArray.length - 1);
		System.out.println("BINARY SEARCH : Index using binary search is : " + text);

		// call the bubble sort function
		algorithms.Sort.bubbleSort(numbers);
	}

}
