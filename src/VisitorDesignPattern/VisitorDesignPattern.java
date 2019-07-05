package VisitorDesignPattern;

public class VisitorDesignPattern {

	public static void main(String[] args) {
		Items[] items = new Items[]{new FastFood("Pizza", 60, 2), new FastFood("Burger", 30, 6),
				new FastFood("Pasta", 40, 1), new Fruit("Grapes", 50, 4), new Fruit("Apple", 110, 2)};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(Items[] items) {
		Visitor visitor = new ShopingCart();
		int sum=0;
		for(Items item : items){
			sum = sum + item.Accept(visitor);
		}
		return sum;

	}

}
