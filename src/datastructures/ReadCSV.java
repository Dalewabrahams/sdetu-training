package datastructures;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

	public static void main(String[] args) {
		
	
		// Initilize a data structure to save the CSV file into
		    ArrayList<String[]> data = new ArrayList<String[]>();
			String filename = "C:\\SDETuniversity\\Files\\accounts.csv";
			String dataRow;
  
			try {
				// open the file
				BufferedReader br = new BufferedReader(new FileReader(filename));
				
				// read the data as long as it's not empty
				while ((dataRow = br.readLine()) != null) {
					//parse the data by commas
					String[]  line = dataRow.split(",");
					//add the data to the collection
					//System.out.println(line);
					data.add(line);
					
					
					
				}
				br.close();
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			for(String[] lines : data) {
				System.out.print("[");
				for (String field : lines) {
					System.out.print(field + "");
				}
				System.out.println("]");
			}
			
	}

}
