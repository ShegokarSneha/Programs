package com.bridgelabz.ObjectOrientedPrograms;

import java.util.LinkedList;

public class InventoryDetails {
	private String productName;

	LinkedList<Properties> properties;

	public LinkedList<Properties> getProperties() {
		return properties;
	}
	
	public void setProperties(LinkedList<Properties> properties) {
		this.properties = properties;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String toString(){
		return getProductName()+getProperties().toString();
	}
	
}
