package lal.harsh.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvConcepts {

	public static void main(String[] args) {
		
		readAndPrint();
	}
	
	
	
	static void readAndPrint()
	{
		String csvFile = "input.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				System.out.println("Country [code= " + country[4] 
						+ " , name=" + country[5] + "]");

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	}
}


