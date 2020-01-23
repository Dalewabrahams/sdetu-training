package labs;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccount stu1 = new StudentAccount("Joe", "9877456325");
		StudentAccount stu2 = new StudentAccount("Mary", "1238745636");

		// print email address
		System.out.println(stu1.getEmail());
		System.out.println(stu2.getEmail());

		// setting city, phone and state
		stu1.setCity("Durban");
		stu1.setPhone("03158699845");
		stu1.setState("KwaZuluNatal");

		// printing out city, phone and state
		System.out.println(stu1.getCity());
		System.out.println(stu1.getPhone());
		System.out.println(stu1.getState());

		// Checking balance
		stu1.checkBalance();

		// Enrolling for a course : This will add a fee of R1000 to your balance
		stu1.enroll("Biology");
		stu1.enroll("Physics");

		// Making a payment on your student account
		stu1.pay(500.00);

		// testing overriding toString method
		System.out.println(stu1.toString());

		// testing showCourses
		System.out.println(stu1.showCourses());

	}

}

class StudentAccount {
	// properties
	private static int iD = 1000; // static is for class, not each instantiated object
	private String userId; // Generate a user ID that is combination of Static ID, random 4-digit number
							// between 1000
	// and 9000, and last 4 of SSN
	private static final double costPerCourse = 1000;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";

	private double balance;

	// Constructor
	public StudentAccount(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		email = name + "@testmail.com";

		// Generate a user ID that is combination of Static ID,
		// random 4-digit number between 1000 and 9000,
		// and last 4 of SSN
		int random = (int) (Math.random() * 10000);
		String lastFourDigits = SSN.substring(SSN.length() - 4, SSN.length());
		userId = iD + "" + random + lastFourDigits; // add a space between iD and random so as not to add them like in
													// maths.
		System.out.println("Created userId: " + userId);
		iD++; // increment the iD for this class.
	}

	public String getEmail() {
		return "Email address is:" + email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return "Phone Number: " + phone;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return "City: " + city;
	}

	public String getState() {
		return "State is: " + state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Payment made for: " + amount);
		checkBalance();
	}

	public void enroll(String courseName) {
		// each course that the student registers for will cost R1000

		if ((courseName == "Biology") || (courseName == "Maths") || (courseName == "Physics")) {
			
			
			if(courses == "") {
				this.courses = courseName;
			}
			else {
				this.courses = this.courses + ", " + courseName;
			}
			balance = balance + costPerCourse;
			System.out.println("You registered for course: " + courseName + ". [" + costPerCourse
					+ " was added to your balance.]. New balance is :" + balance);
		} else {
			System.out.println("Sorry you can only register for Biology, Maths or Physics.");
		}
	}

	@Override
	public String toString() {
		return "[Name: " + name + "]\n[userId: " + userId + "]\n[Courses: " + courses + "]";
	}

	public String showCourses() {
		return "COURSES REGISTERED FOR : [ " + courses + " ]";
	}
}
