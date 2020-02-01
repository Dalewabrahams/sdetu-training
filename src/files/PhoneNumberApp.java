package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Read a phone number from a file
		// Rules for phone numbers
			// 10 digits
			// cannot start with a 0 or a 9
			// cannot have a series of numbers "911"
			// Create all the above as exceptions
		
		
		
		
		
		String filename = "C:\\SDETuniversity\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			phoneNum = br.readLine();
			System.out.println(phoneNum);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: cannot find file :" + filename);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: cannot read file :" + filename);
		}finally {
			System.out.println("Completed reading file");
		}
	
		

		try {
			if ((phoneNum.length() != 10)){
				System.out.println("ERROR: Length needs to be 10 digits");
				throw new ExceptionTenDigits(phoneNum);
			}
		try {
			String substring = phoneNum.substring(0,1);
			if(((phoneNum.substring(0, 1).equals("0"))) || (phoneNum.substring(0, 1).equals("9")))  {
				System.out.println("ERROR : contains a 0 or a 9");
				throw new ExceptionZeroOrNine(phoneNum);
			}
		try {
		//	for (int i=0; i<phoneNum.length();i++) {
				if (phoneNum.contains("911")) {
					System.out.println("ERROR : Cannot contain sequence of 911");
					throw new Exception911(phoneNum);					
				}
		//	}
			
		}
		catch(Exception911 e) {
			System.out.println(e.toString());
		}
			
		}catch(ExceptionZeroOrNine e) {
			System.out.println(e.toString());
		}
		
			
		} catch (ExceptionTenDigits e) {
			System.out.println(e.toString());
			
	
		} finally {
		  System.out.println("Finally");
		}
		
		
	} // end of main
	
	
}  // end of main class


class ExceptionTenDigits extends Exception{
	private String num;

	ExceptionTenDigits(String num){
		this.num = num;
		//System.out.println("CONSTRUCTOR");
	}
	
	@Override
    public String toString(){
		return this.getClass() +  " ExceptionTenDigits : Needs to be 10 digits long!!!!";
	}
	
}


class ExceptionZeroOrNine extends Exception{
	private String num;
	private String contains;

	ExceptionZeroOrNine(String num){
		this.num = num;
		//System.out.println("CONSTRUCTOR");
		
	}
	
	@Override
    public String toString(){
		return this.getClass() +  " ExceptionZeroOrNine : Contains a 0 or a 9!!!!";
	}
	
}
	


class Exception911 extends Exception{
	private String num;
	private String contains;

	Exception911(String num){
		this.num = num;
	//	System.out.println("CONSTRUCTOR");
		
	}
	
	@Override
    public String toString(){
		return this.getClass() + " Exception911 : Contains SEQUENCE 911  !!!!";
	}
	
}

