package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1. Define the file (path) that we want to read
//		String text = null;
//		String filename = "C:/SDETuniversity/Files/FileToRead.txt" ;
//
//					// in java you need to double back slashes or single forward slashes. Jave sees the backslash as an escape character
//				
//		// 2. Now create the file in Java
//		File file = new File(filename);
//		
//		// 3. Open the file
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(file));
//			text = br.readLine();
//		} catch (FileNotFoundException e) {
//			System.out.println("ERROR: File not found: " + filename);
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("ERROR: Could not read the data: " + filename);
//			e.printStackTrace();
//		} finally {
//			System.out.println("Finished reading the file");
//			
//		}
//		System.out.println(text);
//		
//		// 4. Read the file
//		//String text = br.readLine();
//		
		String text = null;
		String filenamea = "C:/SDETuniversity/Files/FileToRead.txt" ;
		File file = new File(filenamea);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			text = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filenamea);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Reading file " + filenamea);
			e.printStackTrace();
		}finally {
			System.out.println("Finished reading" + filenamea);
		}
		
		System.out.println(text);
	
		
		
	}

}
