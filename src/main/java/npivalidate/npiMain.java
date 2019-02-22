package npivalidate;

import reader.npiReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class npiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new java.util.Date());
		
		SpringApplication.run(npiMain.class, args);

		//npiReader test = new npiReader("1003834490");
		
		System.out.println(new java.util.Date());

	}

}
