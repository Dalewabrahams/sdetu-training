package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentTwo_Password {

	public static void main(String[] args) throws IOException {
		// PART A - Read a file
		
		String filename = "C:\\SDETuniversity\\Files\\Password.txt";
		String password = null; 
		try {
			
			File file = new File(filename);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
		    password = br.readLine();
		    System.out.println(password);
		    br.close();
		}catch(IOException e) {
			System.out.println("ERROR : Cannot read file " + filename);
		}finally {
			System.out.println("Completed reading file");
			
		}
		
		// PART B - Write a file
			// Criteria
			// password = 6 digits


		String newPassword = null;	
		boolean passwordLenght = true; 

			
		do {
			passwordLenght = true;
			System.out.print("Enter a new password which is 6 digits long: ");	
			Scanner in = new Scanner(System.in);	
			newPassword = in.next();
		
				if (newPassword.length() <= 5) {
					  System.out.println("Must be at least 6 digits");
					  passwordLenght = false; 
				}
				else {
							
							try {
								File file1 = new File(filename);
						
								FileWriter fw = new FileWriter(file1);
								
								fw.write(newPassword);			
							 
							
								fw.close();
								System.out.println("SUCCESSFULLY SAVED YOUR NEW PASSWORD");
								} catch(IOException e) {
									System.out.println("ERROR: Could not read file :" + filename);
									e.printStackTrace();
								} finally {
									System.out.println("Closing the file writer");
							}
				}

				} while (!passwordLenght);
	}
	
}



