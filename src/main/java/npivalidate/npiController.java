package npivalidate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class npiController {
	static String curDir;
	//static npiData defData = new npiData();
	//private final static String template = defData.toString();
	
	@RequestMapping("/npivalidate")
	public npiList npiValidate(@RequestParam(value="npi") String npi) {
		
		//String FILE_NAME = "C:\\Spring workspace\\npi-validate\\data\\npi.txt";
	    curDir = System.getProperty("user.dir") + File.separator;
	    //String FILE_NAME = curDir + "\\data\\npi.txt";
	    String FILE_NAME = curDir + "data"+ File.separator +"npi.txt";
	    
	    
	    System.out.println("FILE_NAME (directory) is " + FILE_NAME);
		
		String line = "";
		String cvsSplitBy = "\\|\\|";
		npiData npiCheck;
		List<npiData> results = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			while ((line = br.readLine()) != null) {
				//System.out.println("line is " + line);
				if (line.substring(0,10).equals(npi)) {
					String[] npiLine = line.split(cvsSplitBy);
					return new npiList(new npiData (npiLine[0],npiLine[1],npiLine[2],npiLine[3],npiLine[4],npiLine[5],
							npiLine[6],npiLine[7],npiLine[8],npiLine[9],npiLine[10]));			
					//return thelist;
				}
			}
    	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new npiList(new npiData("0000000000","Invalid NPI","","","","","","","","",""));
		//return thelist;
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
