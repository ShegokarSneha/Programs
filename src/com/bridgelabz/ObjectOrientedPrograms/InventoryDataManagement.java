package com.bridgelabz.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.Util.Util;

public class InventoryDataManagement {
	public static void main(String[] args) throws IOException , FileNotFoundException {
		System.out.println("*** Program for Inventory Data Management ***");
		
        try {
			
			ObjectMapper mapper = new ObjectMapper(); //Maps json file fields to setter getter of POJO class
		//	File file = new File("/home/admin1/Desktop/Files/Inventory.json");
		//	ProductList productList = mapper.readValue(file,ProductList.class); //reads from JSON file
			Product product = new Product();
			ProductList productList = new ProductList();
			System.out.println("Enter the Product name ");
			String productName = Util.getInputString();
			productName = productName.toLowerCase();
			if(productName.equals("rice")||productName.equals("pulses")||productName.equals("wheats"))
			{
				product.setProductName(productName);
				ArrayList<ProductProperties> properties= new ArrayList<ProductProperties>();
				ProductProperties input = input();
				
				properties.add(input);//properties added to list
				product.setProperties(properties);
				List <Product> products = productList.getInventory();
				products.add(product);
				productList.setInventory(products);
			//	ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			//	 writer.writeValue(new File("/home/admin1/Desktop/Files/Inventory.json"), productList);
				mapper.writeValue(new File ("/home/admin1/Desktop/Files/Inventory.json"), productList);
				String result = (mapper.writeValueAsString(productList));
				System.out.println(result);
			}
			else
			{
				System.out.println("InCorrect input please run again...!");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect ");
		}
	}
	public static ProductProperties input() {
	
		ProductProperties productProperty=new ProductProperties();
	//	List<ProductProperties> productProperty= new ArrayList<ProductProperties>();
	
		System.out.println("Enter the Name of Product Type: ");
		String productTypeName = Util.getInputString();
		productProperty.setName(productTypeName);
		System.out.println("Enter the Weight: ");
		double productWeight = Util.getInputDouble();
		productProperty.setWeight(productWeight);
		System.out.println("Enter the Price: ");
		double productprice  = Util.getInputDouble();
		productProperty.setPrice(productprice);
		System.out.println();
	
		return productProperty;
		
	}

}
