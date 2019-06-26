package com.bridgelabz.ObjectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
public class InventoryManager {
	
	public static void main(String [] args) {
		
		ObjectMapper mapper = new  ObjectMapper();
		File file = new File("/home/admin1/eclipse-workspace/JSON File/Inventory.json");
		System.out.println("*** Program for Inventory Data Management ***");
		LinkedList<InventoryDetails> list = new LinkedList<>();
		try {
			list = mapper.readValue(file,new TypeReference<LinkedList<InventoryDetails>>(){});
		//	System.out.println(list);
			long eachinventory = 0;
			long total = 0;
			for(int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.get(i).getProperties().size(); j++) {
					eachinventory = eachinventory + (list.get(i).getProperties().get(j).getPrice() * 
							list.get(i).getProperties().get(j).getWeight());
				}
				System.out.println("\nValue of "+ list.get(i).getProductName()+ " in Inventory: "+ eachinventory);
				total = total + eachinventory;
			}
	//		System.out.println(list.get(2).getProperties().get(1).getPrice());
			System.out.println("\nTotal Inventory : " + total);
				
			} 
		catch (JsonParseException e) {
			
				e.printStackTrace();
			} 
		catch (JsonMappingException e) {
			
				e.printStackTrace();
			} 
		catch (IOException e) {
			
				e.printStackTrace();
			}
		
	}

}
