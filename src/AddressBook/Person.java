package AddressBook;

import java.util.LinkedList;

public class Person {
	
	String fname;
	String lname;
	LinkedList<Address> address;
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
	
	public LinkedList<Address> getAddress() {
		return address;
	}
	
	public void setAddress(LinkedList<Address> address) {
		this.address = address;
	}
	
	public String getPhoneno() {
		return phoneno;
	}
	
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public String toString() {
		return "First Name : "+getFname()+" Last Name : "+getLname()+
				" Address : "+getAddress().toString()+" Phone No : "+getPhoneno();
	}

}
