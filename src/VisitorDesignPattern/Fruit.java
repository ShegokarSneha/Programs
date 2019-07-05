package VisitorDesignPattern;

public class Fruit implements Items{
	private int price;
	private int weight;
	private String name;
	
	public Fruit(String name, int price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public int getPricePerKg() {
		return price;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int Accept(Visitor visitor) {
		return visitor.Visit(this);
	}


}
