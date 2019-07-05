package VisitorDesignPattern;

public class FastFood implements Items{
	private int price;
	private int quantity;
	private String name;
	
	public FastFood(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public int Accept(Visitor visitor) {
		
		return visitor.Visit(this);
	}

}
