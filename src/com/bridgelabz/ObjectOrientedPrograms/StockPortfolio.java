package com.bridgelabz.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedList;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockPortfolio {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ObjectMapper mapper = new  ObjectMapper();
		FileReader file = new FileReader("/home/admin1/eclipse-workspace/JSON File/Stock.json");
		System.out.println("*** Program To Print Stock Report ***\n");
		LinkedList<StockDetails> list = new LinkedList<>();
		
		try {
			
			list = mapper.readValue(file, new TypeReference<LinkedList<StockDetails>>(){});
			System.out.println(list.toString());
			// to print data in json file
			
			StringWriter stock = new StringWriter();
			mapper.writeValue(stock, list);
			System.out.println("\n*** Stock Values In the File ***\n"+"\n"+stock);
			long eachvalue = 0;
			long total = 0;
			
			// for loop to get each share price and no of shares
			
			for(int i = 0; i < list.size(); i++) {
				eachvalue = list.get(i).getNoofshares() * list.get(i).getShareprice();
				System.out.println("\nValue of "+list.get(i).getSharename()+" Stock: "+eachvalue);
				total = total + eachvalue;
			}
			System.out.println("\nTotal Stock Value: "+ total);
			} 
		catch (FileNotFoundException e) {
			System.out.println("File is not present at given location !");
			} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			}
	}
}
