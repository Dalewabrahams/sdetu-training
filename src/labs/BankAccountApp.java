package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("1235459557",1000);
		BankAccount acc2 = new BankAccount("7788889652",2000);
		BankAccount acc3 = new BankAccount("9874562321",3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
	    		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		
		acc1.showBalance();
		acc1.accrue();
		System.out.println(acc1.toString());
	}	
}

class BankAccount implements IInterest{
	// properties of bank account
	private static int iD = 1000;	// internal ID. Static so its unique for each object ie it belongs to the class
	private String accountNumber;   // iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "004559865";  // static because it belongs to class, not instantiated object
	private String name;
	private String SSN;
	private double balance;
	private static final boolean debug = false;  // final means that it cannot be changed
											     // like a constant
	
	// Constructor
	public BankAccount(String SSN, double initDeposit){
		balance = initDeposit;
		this.SSN = SSN;
		setAccountNumber();
		iD++;
	}
	
	private void setAccountNumber() {	
		int random = (int) (Math.random() * 100);
		String firstTwoDigits = SSN.substring(0, 2);
		accountNumber = iD + "" + random + firstTwoDigits;
		System.out.println("Your Account Number = " + accountNumber);

	}
	
	private void debug() {
		if(debug) {
			System.out.println("iD = " + iD);
			System.out.println("random number = " + random);
			System.out.println("firstTwoDigits = " + firstTwoDigits);
			System.out.println("accountNumber = " + accountNumber);
			System.out.println("");
			System.out.println("");
		}
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Withdral of : " + amount + ". Balance = " + balance);
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit of : " + amount + ". Balance = " + balance);
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1  + rate /100);
		showBalance();
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + " ]\n" + "[Routing Number:" + routingNumber + " ]\n" + "[Balance: " + balance + " ]";
				
	}


}
	

	


