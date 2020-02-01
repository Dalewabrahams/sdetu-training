package exceptionfiles;

import java.util.Scanner;

public class PaymentsApp {

		
	    // Take a payment from the user
	
		public static void main (String[] args) {			
		double payment = 0;
		boolean positivePayment = true; 
			
		// 1. Ask the user for input
			System.out.print("Enter a payment amount: ");
		
		
		// 2. Get the amount and test the value
			// use scanner
			
			Scanner in = new Scanner(System.in);					
	
		// 3. Handle exceptions appropriately
			// if less than zero, then use an exception class which you will create. 
			
			do {
				positivePayment = true;
				try {
					payment = in.nextDouble();
					if (payment < 0) {
						throw new NegativePaymentException(payment);  // you not showing a message but you creating a class and you use THROW and create a new class of that exception
					}	
					 
				} catch (NegativePaymentException e)   {
				    //build an exception class
					System.out.println(e.toString());
					System.out.println("Please try again");
					positivePayment = false;
				}
			} while (!positivePayment);  // while not true
		
		// 4. Print confirmation
			if (positivePayment) {
				System.out.println("Thanks for payment of :" + payment);
			}
			
	}

}
