package ObserverDesignPattern;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomername("Dinesh");
		Customer customer2 = new Customer();
		customer2.setCustomername("Vijay");
		
		Product iphone = new Product();
		iphone.setProductname("Apple iPhone X");
		iphone.setAvailable(false);
		
		iphone.registerObserver(customer1);
		iphone.registerObserver(customer2);
		
		iphone.setAvailable(true);
		

	}

}
