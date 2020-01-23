package OOP;

public class AccountApp {

	public static void main(String[] args) {
	
			LoanAccount la = new LoanAccount();
			la.increaseRate();
			la.setRate();
			la.setAmmortSchedule();
			la.setTerm(20);
			
			// Ploymorphism changes where we are pointing
			
			// creating a variable based on IRate properties 
			// it must point to LoanAccount properties
			
			IRate account1 = new LoanAccount();
			account1.increaseRate();
			account1.increaseRate();

	}

}
