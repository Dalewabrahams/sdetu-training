package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordsManyLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String filename = "C:\\SDETuniversity\\Files\\PasswordsManyLines.txt";
		File file = new File(filename);
		String[] passwords = new String[5];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i=0;i<passwords.length;i++) {
			   passwords[i] = br.readLine();
			   System.out.println(passwords[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR : cannot find file");
		} catch(IOException e ) {
			System.out.println("ERROR : cannot read file");
		}
		
		System.out.println("\nUsing FOR EACH\n...");
		for (String letter : passwords) {
			System.out.print(letter + " ");
		}
		

	}

}
 