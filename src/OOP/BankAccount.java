package OOP;

public class BankAccount implements IRate{
// we will instantiate objects from here so we don't need a main.
	
	// Define variables
	
	// static >> belongs to the class, not the object instantiated
	// final >> constant
	private static String routingNumber = "999999"; 
	
	// Instance variables
	String accountNumber; 
	
	// we should set variables to private.
	// Encapsulation means : setting variables to private and accessing them
	// through public methods
	private String name; 
	private String ssn;
	String accountType;
	double balance = 0;
	double deposit = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself.
		// 4. Constructors have no return type.
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT CREATED : " + accountType);
	}
	 
	BankAccount(String accountType, double  initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT CREATED : " + accountType);
		System.out.println("Initial deposit of : $" + initDeposit);
		String Msg;
		if (initDeposit < 1000) {
			Msg = "ERROR - Your initial deposit needs to be greater than $1000";
		}
		else {
			Msg = "Thank you for your deposit : " + initDeposit;
			deposit = initDeposit;
			
		}
		System.out.println(Msg);
	}
	
	// Getters / Setters
	// Allow the user to define the name
	
	
		// SETTER
		// 1.  Set to public
		// 2. Set as void as it doesn't need to return anything
		// 3. Pass in a paramater
		// 4.  Usually starts with prefix of "set"
		// 5.  To set the private variable of the object, use "this."
	 
	
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		
		// GETTER
		// 1.  Set to public
		// 2.  Set as RETURN TYPE as it returns something to the user
		// 3.  Usually starts with prefix of "get"
		// 4.  Use RETURN and the private variable being returned
	
		
		public String getName() {
			return name;
		}
		
		
		
		
		
		
	public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		
	// Interface methods : if implementing in this class, it becomes like a
	// contract and you must therefore set public methods to be able to use
	// your interface
		
		public void setRate() {
			System.out.println("SETTING RATE");
		}
		
		public void increaseRate() {
			System.out.println("INCREASING RATE");
		}
			
			
			
		
		
		
	// Define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw (double amount) {	
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		balance = balance + deposit;
		System.out.println("Your balance is : " + balance + ". deposit = " + deposit);
	}
	
	void getStatus() {
		
	}
	
	// overriding a method on object class
	@Override
	public String toString() {
		return  "[ " + name + ". " + accountNumber + ". BALANCE: " + balance + " ]";
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS : " + balance);
	}

	
}

