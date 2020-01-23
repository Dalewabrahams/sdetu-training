package OOP;


class Person {
	String name;
	String email; 
	String phone; 
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		
		// instantinating an object
		// Java will allocate space for this variable
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "Joe@testmail.com";
		person1.phone = "0785545568";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		
		person2.name = "Sarah";
		person2.sleep();
		
		
//		// Person  
//		
//		// Atrributes, variables, adjectives, descriptors
//		String name = "Joe";
//		String email = "Joe@testmail.com";
//		String phone = "0787855585";
//		
//		// Actions, activity, behaviour
//		System.out.println(name + " is walking");
//		System.out.println(name + " is eating");
//		
//		// Atrributes, variables, adjectives, descriptors
//		String name2 = "Sarah";
//		String email2 = "Sarah@testmail.com";
//		String phone2 = "0787855777";
//		
//		// Actions, activity, behaviour
//		//System.out.println(name2 + " is walking");
//		//System.out.println(name2 + " is eating");
//		//walking(name);
//		//walking(name2);
//		
//		// Enhance by adding functions to minimize code
////		 static String walking(String pname) {
////			System.out.println(pname + " is walking");
////		}
	}

}
