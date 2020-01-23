package labs;

public class AssignmentOneB {
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
   
	}
	
	
	public static int factorial(int n) {
	//		
	//		Write a function that computes the factorial value
	//		Definition: n! = n*(n-1)! , where 0! = 1
	//		1! = 1
	//		2! = 2 * 1! = 2 * 1
	//		3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
	//		4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	//		Hint: use the recursive method that was used to calculate Fibonnaci number
	
	   if (n == 0) {
		   return 1;
	   }
	   
	   return ( (n) * (factorial(n-1))  );
	   
    }
	

}
