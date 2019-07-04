package ObserverDesignPattern;

public class Customer implements Observer{
	
	private String customername;
	private Subject subject;

	@Override
	public void update(String productname) {
		System.out.println("\nHello "+ customername+"," +"\n"+productname+" is now Available" );
		
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	

}
