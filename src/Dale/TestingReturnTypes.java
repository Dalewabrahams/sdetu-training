package Dale;

public class TestingReturnTypes {

	public static void main (String[] args) {	
		fullNameAndAge("Dale", "Abrahams", 41);
		System.out.println(agedBasedOnYearOfBirth(1978));
		fullNameAndYearOfBirth("Tabitha", "Abrahams", 1986);
		
		String names = commaDelimitedNames("Dale");
		names = names + commaDelimitedNames("Tabitha");
		names = names + commaDelimitedNames("Luke");
		System.out.println(names);
	}
	
	public static void fullNameAndAge(String name, String surname, int age) {	
		System.out.println("My name is " + name + " " + surname + " and I am " + age + " years old.");
	}
	
	
	public static int agedBasedOnYearOfBirth(int yearOfBirth) {
		int icurrentYear = 2019;
		int age = icurrentYear - yearOfBirth;
		return age;
	}
	
	
	public static void fullNameAndYearOfBirth (String name, String surname, int yearOfBirth) {
		int iage = agedBasedOnYearOfBirth(yearOfBirth);
		System.out.println("My name is " + name + " " + surname + " and I am " + iage + " years old.");		
	}
	
	
	public static String commaDelimitedNames(String pString) {	
		return  pString + ", "  + "\n";
	}
}
