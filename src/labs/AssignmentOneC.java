package labs;

public class AssignmentOneC {
	/* 	Write 3 functions that take an array as a parameter and return the 
	   	minimum, average, and maximum values of that array.
		Hint: this should be static functions with a return type of the same data type 
		as the array declaration.
    */ 

	public static void main(String[] args) {
		int[] iArray = {3,7,5};
		
		
		int iMin = min(iArray);
		System.out.println("Min value in array is " + iMin);
		

		int iMax = max(iArray);
		System.out.println("Max value in array is " + iMax);
		
		int iAvg = avg(iArray);
		System.out.println("Average value in array is " + iAvg);

	}


	public static int min(int[] arrayOfInt) {
	// find the minimum value in a array		
		int smallest = arrayOfInt[0];
		for (int i = 0; i < arrayOfInt.length; i++) {
			
			
			if (i > 0) {
				if (arrayOfInt[i] < smallest) {
					smallest = arrayOfInt[i];
				}
			}
		}
		return smallest;
	}
	


	public static int max(int[] arrayOfInt) {
	// find the minimum value in a array		
		//int[] iArray = {3,7,5};
		
			int biggest = arrayOfInt[0];
			for (int i = 0; i < arrayOfInt.length; i++) {
				
				
				if (i > 0) {
					if (arrayOfInt[i] > biggest) {
						biggest = arrayOfInt[i];
					}
				}
			}
			return biggest;
		}



	public static int avg(int[] arrayOfInt) {
	// find the average value in a array
		int sum = 0; 
		for (int i = 0; i < arrayOfInt.length; i++) {
			sum = sum + arrayOfInt[i];
	  }
	  return sum / arrayOfInt.length;	
	}
		

}
