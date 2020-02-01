package exceptionfiles;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starting");
		doMath(12, 1);
		
		/* to cause the exception to bubble up answers method, then doMath method, then main method
		 * enter a zero as a second parameter
		 * uncomment below for the exception to bubble up
		 * doMath(12, 1);
		 */
		System.out.println("program continues");
	}

	public static void doMath(int a, int b) {
		answer(a, b);
	}

	public static int answer(int x, int y) {

		return x/y;

	}
}

