package Discount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Demo {
	
	


     public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL abc =new URL("https://jsonmock.hackerrank.com/api/inventory?barcode=74002314");
		
		BufferedReader br = new BufferedReader(new InputStreamReader (abc.openStream()));
		
		String inputline;
		
		   while ((inputline = br.readLine()) != null)
	            System.out.println(inputline);
	        br.close();	
	        
	       
		

	}

}
