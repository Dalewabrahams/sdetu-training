package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		 
		//bookTitle.toLowerCase();
		//wordChoice.toLowerCase();
		
		//String bookTitleLowerCase = bookTitle.toLowerCase();	
		//String wordChoiceLowerCase = wordChoice.toLowerCase();
		
		
//		if (bookTitleLowerCase.contains(wordChoiceLowerCase)) {
//			System.out.println("The book title contains the word " + wordChoiceLowerCase);
//		}

		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book title contains the word " + wordChoice);
		}
		
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
			
		}
		
		
		String name = "Dale";
		String surname = "Abrahams";
		String SSN = "554266586422283";
				
		if (SSN.length() !=14) {
			System.out.println("SSN needs to be 14 digits");
		}
		// print first initials and last 4 digits of SSN
		System.out.print(name.substring(0, 1));
		System.out.print(surname.substring(0,1));
		System.out.println(SSN.substring(9));
		System.out.println("Length of " + SSN + " is " + SSN.length());
		int SSNlenght = SSN.length();
		// you want the last 4 digits so you want to basically start at (LENGTH - 4)
		int numberOfDigitsToAppend = 4;
		System.out.println(name.substring(0,1) 
							+ surname.substring(0,1) 
							+ SSN.substring(SSN.length() - numberOfDigitsToAppend, SSN.length()));
	}

}
