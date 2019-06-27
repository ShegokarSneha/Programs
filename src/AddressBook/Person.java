package AddressBook;

public class Person {
	
	String fname;
	String lname;
	Address address;
	String phoneno;
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getPhoneno() {
		return phoneno;
	}
	
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public String toString() {
		return getFname()+" \t"+getLname()+
				"\t"+getAddress().toString()+"\t"+getPhoneno();
	}

}


