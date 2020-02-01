package labs;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AssignmentThree_CSV {
/*
 * Questions for this assignment
Read a credit card CSV statement
Creating a balance variable that calculates the running balance of the user’s account
If the field says CREDIT, then add the amount to the balance
If the field says DEBIT, then subtract the amount to the balance
If the final amount is greater than zero, charge a 10% fee and warn the user
If the final amount is zero, thank the user for their payments
If the final amount is less than zero, thank the user for their payment and display their overpayment.



Use this data for your test, or generate your own:

Sep02,CREDIT,CostCo,342.23
Sep09,CREDIT,ATT,93.42
Sep10,CREDIT,Applebees,56.20
Sep11,CREDIT,AppleStore,995.95
Sep12,DEBIT,ACHPayment,500
Sep19,CREDIT,Speedway,35.09
Sep20,CREDIT,McDonalds,12.55
Sep21,DEBIT,ACHPayment,600
Sep26,DEBIT,ACHPayment,250
Sep30,FEE,MasterCard,2.50


 * 
 * */
 
	public static void main(String[] args) {
		// Initilize a data structure to save the CSV file into
	    ArrayList<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\SDETuniversity\\Files\\CCStatement.csv";
		String dataRow;
		double balance = 0;
		
		try {
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// read the data as long as it's not empty
			while ((dataRow = br.readLine()) != null) {
				//parse the data by commas
				String[]  line = dataRow.split(",");
				//add the data to the collection
				//System.out.println(line);
				transactions.add(line);
				
				
				
			}
			br.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//balance double = 0;

		for(String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String value = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			
		   if(type.equalsIgnoreCase("credit")) {
			   balance = balance + amount;
		   }
		   else if (type.equalsIgnoreCase("debit")) {
				   balance = balance - amount;
		
		   }
		   else if (type.equalsIgnoreCase("fee")) {
			   balance = balance + amount;
		   }
			
			System.out.print(date + " " + type  + " " + value + " " + amount + " -----> " + balance + "\n");
		}
				
//			If the final amount is greater than zero, charge a 10% fee and warn the user
//			If the final amount is zero, thank the user for their payments
//			If the final amount is less than zero, thank the user for their payment and display their overpayment.

			
		    if(balance > 0) {
				double interest = (balance * 10) / 100;
			    System.out.println("Alert, your balance is " + balance + ". A fee 10% fee will be added to your account and the fee amount is : " + interest);
			    balance = balance + interest;
			}
		    else if(balance == 0) {
		    	System.out.println("Your balance is zero. Thank your for your payments");
		    }
		    else if(balance < 0) {
		    	System.out.println("Thank you for your payment. You have overpaid by " + balance);
		    	
		    }

	}

}
