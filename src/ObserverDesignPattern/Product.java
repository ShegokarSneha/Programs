package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	private String productname;
	private List<Observer> list = new ArrayList<Observer>();
	private boolean available;

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available) {
			notifyObservers();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
		
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<Observer> getObserver() {
		return list;
	}

	public void setObserver(List<Observer> observer) {
		this.list = observer;
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
		
	}
	
	@Override
	public void notifyObservers() {
		System.out.println("Notify Customer When the Product becomes Available");
		for(Observer customer : list) {
			customer.update(productname);
		}
		
	}
	

}
