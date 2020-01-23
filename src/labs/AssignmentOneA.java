package labs;

public class AssignmentOneA {
	
		public static void main(String[] args) {
	    int sum = sumOfN(4);
	    System.out.println(sum);
	   
		}

		
		public static int sumOfN(int n) {
			//Write a function that takes a value n returns the sum of numbers 1 to n
			int sum = 0;
			for (int i = 0; i <=n ; i++) {
				sum = sum + i;
			}
			return sum;
		}
}
