package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined by the sum of the two previous fibonacci numbers
        // fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(2));
		System.out.println("factorial = " + fac(4));
		System.out.println("");
		//Reversed("DALE");
		stringRevesered("Dale");
		System.out.println(stringRevesered("Dale"));
	}

	
	public static int fib(int n) {
		
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ( (fib(n-1)) + fib(n-2)   );
		
	}
	
	
	 public static int fac(int n) {
		 // factorial 
		 
		 // 1! = 1 * 1  = 1
		 // 2! = 2 * 1 = 2
		 // 3! = 3 * 2 * 1 = 6
		 // 4! = 4 * 3 * 2 * 1 = 24
		String sTemp = "";
		//String sTempReversed = "";
		int product = 1;
		
		for (int i = 1; i <= n; i++) {
			product = product * i;
		//	System.out.println("i = " + i);
		//	System.out.println("product = " +  product);
			
			if (i == 1) {
				sTemp = "1";
			};
			sTemp = sTemp + " * " + i ;
			//System.out.println("sTemp = " +  sTemp);
		}
		sTemp = sTemp; // + " = " + product; 
		sTemp = "Factorial of " + n +  " = " +  product + ". Calculated as " + stringRevesered(sTemp);
		System.out.println(sTemp);
		return product;
	 }
	 
	 public static String stringRevesered(String sTemp) {
		 
		 String sReversed = "";
		 String sReversedFinal = "";
		
		int c = sTemp.length() - 1;
	 	while (c >= 0) { 
	 		//System.out.print(" c = " + c);
	 		sReversed = sReversed + sTemp.charAt(c);
	 		c--;
	 		
	 	}
		 
		return sReversed;
	 	
	 
		}
	 
//	 public static String stringRevesered(String sTemp) {
//		 return "Testing";
//	 }
	 
}

