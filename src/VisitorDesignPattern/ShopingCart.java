package VisitorDesignPattern;

public class ShopingCart implements Visitor{
	@Override
	public int Visit(FastFood fastfood) {
		int cost = 0;
		int temp = 0;
		// if quantity > 5 then 20 discount
		if(fastfood.getQuantity() < 5) {
			temp = fastfood.getQuantity()*fastfood.getPrice();
			cost = temp - 20;
		}
		else {
			cost = fastfood.getQuantity()*fastfood.getPrice();
		}
		System.out.println("Fast Food : "+fastfood.getName()+"\nTotal Cost : "+cost);
		System.out.println();
		return cost;
	}

	@Override
	public int Visit(Fruit fruit) {
		int cost = 0;
		cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName() +"\t"+"Price "+cost);
		System.out.println();
		return cost;
	}

}
