package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import npivalidate.npiData;

public class npiReader {
	
	public npiReader(String npi) {
		String FILE_NAME = "C:\\Spring workspace\\npi-validate\\data\\npi.txt";
    
		String line = "";
		String cvsSplitBy = "\\|\\|";
    
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			while ((line = br.readLine()) != null) {
				//System.out.println("line is " + line);
				//String[] npiLine = line.split(cvsSplitBy);  
				//System.out.println(npiLine[0]);
				if (line.substring(0,10).equals(npi)) {
					String[] npiLine = line.split(cvsSplitBy);
					npiData thisData = getNpiRecord(npiLine);
					//System.out.println(npiLine[0]);
					//System.out.println(String.format("npi: %s\nsomething: ", line));
				}
			}
    	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	npiData getNpiRecord (String[] npiLine) {
		return new npiData(npiLine[0],npiLine[1],npiLine[2],npiLine[3],npiLine[4],npiLine[5],
				npiLine[6],npiLine[7],npiLine[8],npiLine[9],npiLine[10]);
	}
};
