package AddressBook;

import java.util.LinkedList;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.Util.Util;

public class AddressBookMethods {
	static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<Person> list = new LinkedList<>();
	static Person person = new Person();
	static Address address = new Address();
	
	public static void existing() {
		int choice = 0;
		do{
			System.out.println("\nWhich Operation You Want To Perform ?");
			System.out.println("Enter Your Choice:\n"
					+ "1. Add New Person \n2.Edit Person \n3. Delete Person "
					+ "\n4. Sort Entries By Name \n5. Sort Entries By Zip Code ");
			choice = Util.getInputInteger();
			switch(choice) {
			
			}
		}while(choice > 0 && choice < 6);
	}
		
	public static void addPerson() {
		
		System.out.println("\nEnter First Name:");
		String fname = Util.getInputString();
		person.setFname(fname);
		
		System.out.println("\nEnter Last Name:");
		String lname = Util.getInputString();
		person.setLname(lname);
		
		System.out.println("\nEnter Address:");
		System.out.println("Enter City:");
		String city = Util.getInputString();
		address.setCity(city);
		
		System.out.println("Enter State:");
		String state = Util.getInputString();
		address.setState(state);
		
		System.out.println("Enter Zip Code:");
		String zipcode = Util.getInputString();
		address.setCity(zipcode);
		
		System.out.println("\nEnter Phone No:");
		String phoneno = Util.getInputString();
		person.setPhoneno(phoneno);
		}
	
	public static void editPerson() {
		
		
		
	
		
		
	}
	
	public static void deletePerson() {
		
	}
	
	public static void printEntries() {
		
	}

	public static void quitProgram() {
		System.exit(0);
		}

	
}
