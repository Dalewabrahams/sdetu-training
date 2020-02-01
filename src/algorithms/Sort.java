package algorithms;

public class Sort {

	public static void bubbleSort(int[] dataSet) {
		boolean swapped = false;
		System.out.println("ORIGINAL ARRAY :  ");
		printArr(dataSet);
		
		do {
		
			swapped = false;
			
				for(int i=0;i<dataSet.length -1;i++) {
					if(dataSet[i] > dataSet[i+1]) {
						 int temp = dataSet[i];
						 dataSet[i] = dataSet[i+1];
						 dataSet[i+1] = temp;
						 swapped = true;
					}
					System.out.println("after swap" + "\n");
					printArr(dataSet);
				}
		}while(swapped);
	}
	
	private static void printArr(int[] arr) {
		for(int element : arr) {
			System.out.print(element + " ");
		}
	}

}
