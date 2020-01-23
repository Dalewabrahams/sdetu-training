package OOP;

public class BankingAccountApp {

	public static void main(String[] args) {
		
		// Creating a new bank account >> think instantiate an object


		BankAccount acc1 = new BankAccount();
		
		// old way
		// acc1.name = "TestName";
		
		// new way >> with encapsulation PUBLIC API METHODS
		// encapusulation is all about hiding. 
		acc1.setName("Roger Hue");
		System.out.println(">>>>>>>>>>>>>>>>>" + acc1.getName());
		
		acc1.setSsn("55555555555555555555555555555");
		System.out.println(acc1.getSsn());
		
		acc1.setRate();
		acc1.increaseRate();
	
		acc1.accountNumber = "225466585";
	
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Cheque account");
		
		BankAccount acc3 = new BankAccount("Cheque account", 2455.32 );
		//acc1.balance = 555486.00;
//		
//		acc1.deposit(1500);
//		acc1.deposit(1500);
//		acc1.deposit(1500);
//		acc1.withdraw(2000);
//		
//		
//		System.out.println(acc1.toString());
//		
//		CDAccount cd1 = new CDAccount();
//		
//		cd1.name = "Bob";
//		cd1.accountNumber = "2254666998854";
//		cd1.deposit = 5588459.25;
//		System.out.println(cd1.toString());
//		
//		
//		
//		
//		BankAccount acc2 = new BankAccount("Cheque account");
//		
//		BankAccount acc3 = new BankAccount("Cheque account", 2455.32 );
//		acc3.deposit(1002);
//		acc3.checkBalance(); 
	
		//acc1.routingNumber = "1234";
		//acc2.routingNumber = "5678";
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
	
	//	System.out.println(BankAccount.routingNumber);
		
	}

}
