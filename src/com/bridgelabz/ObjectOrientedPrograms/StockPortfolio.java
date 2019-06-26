package com.bridgelabz.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockPortfolio {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ObjectMapper mapper = new  ObjectMapper();
		FileReader file = new FileReader("/home/admin1/eclipse-workspace/JSON File/Stock.json");
		System.out.println("*** Program To Print Stock Report ***");
		try {
			LinkedList<StockDetails> list = new LinkedList<>();
		//	System.out.println("hello");
			list = mapper.readValue(file, new TypeReference<LinkedList<StockDetails>>(){});
			long eachvalue = 0;
			long total = 0;
			for(int i = 0; i < list.size(); i++) {
				eachvalue = list.get(i).getNoofshares() * list.get(i).getShareprice();
				System.out.println("\nValue of "+list.get(i).getSharename()+" Stock: "+eachvalue);
				total = total + eachvalue;
			}
			System.out.println("\nTotal Stock Value: "+ total);
			} catch (FileNotFoundException e) {
				System.out.println("File is not present at given location !");
				} catch (IOException e) {
					System.out.println(e.getMessage());
					}
		}
	


}
