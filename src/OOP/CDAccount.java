package OOP;

// letting one class inherit from another class
public class CDAccount extends BankAccount  implements IRate{
	
	String interestRate;
	
	void compound() {
		System.out.println("Compounding interest");
	}


}
