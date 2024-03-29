package com.bridgelabz.ObjectOrientedPrograms;

public class Properties {
	
	private String name;
	private long price;
	private long weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getWeight() {
		return weight;
	}
	
	public void setWeight(long weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "Name: "+getName()+" Price:"+getPrice()+" Weight :"+getWeight();
	}
	
	

}
