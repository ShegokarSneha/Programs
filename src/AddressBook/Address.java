package AddressBook;

public class Address {
	String city;
	String state;
	String zipcode;
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipcode;
	}
	
	public void setZipCode(String zip) {
		this.zipcode = zip;
	}
	
	public String toString() {
		return getCity()+" "+getState()+" "+getZipCode();
	}

}
