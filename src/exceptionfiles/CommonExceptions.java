package exceptionfiles;

public class CommonExceptions {
	
		public static void main(String[] args) {
			int a = 5; 
			int b = 0;
			
			// 1. Identify the potential problem area
			// 2. At a surround with try-catch block
			
			try {
				int c = a/b;
			} catch (ArithmeticException e) {
				System.out.println("CANNOT DIVIDE BY ZERO");
				System.out.println(e.toString());
			}
			System.out.println("Program is closing");
			
			
			String[] states = {"CA", "NY", "FK" , "AD"};
			
			for(int i = 0; i <= states.length ; i++) {
				System.out.println("starting for loop");
		
				try {
					System.out.println(states[i]);
					System.out.println("in try ");
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("ERROR : Index is out of bounds");
					System.out.println("HANDLING " + e.toString());
					System.out.println("end of catch");
				}finally {
					System.out.println("finally");
				}
		

				
				
				}
			}
}
