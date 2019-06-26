package com.bridgelabz.ObjectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class InventoryDataManagement {
	public static void main(String [] args) {

	ObjectMapper mapper = new  ObjectMapper();
	File file = new File("/home/admin1/eclipse-workspace/JSON File/Inventory.json");
	System.out.println("*** Program for Inventory Data Management ***");
	LinkedList<InventoryDetails> list = new LinkedList<>();
	
	try {
		list = mapper.readValue(file,new TypeReference<LinkedList<InventoryDetails>>(){});
		System.out.println(list.toString());
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
