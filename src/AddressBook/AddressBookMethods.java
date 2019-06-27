package AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.Util.Util;

public class AddressBookMethods {
	static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<Person> list = new LinkedList<>();
	static Person person = new Person();
	static Address address = new Address();
	static String location = "/home/admin1/eclipse-workspace/JSON File/";
	
	public static void createNewAddressBook() throws JsonParseException, JsonMappingException, IOException {
		String filename = "";
		System.out.println("Enter File Name which you Want to Create :");
		filename = Util.getInputString();
		boolean isCreated = false;
		try {
			File file = new File(location + filename+".json");
		
		 /*If file gets created then the createNewFile() method would return true or 
		  * if the file is already present it would return false
	      */
			
			isCreated = file.createNewFile();
			if(isCreated) {
				System.out.println("\nFile Created Successfully...!");
				}
			else {
				System.out.println("\nFile already Present...");
				}
			System.out.println("\nAdd New Person Details:");
			addPerson(filename);
			}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void existingOperations(String filename) throws JsonParseException, JsonMappingException, IOException {
		
		printEntries(filename);
		
		int choice = 0;
		
		do{
			System.out.println("\nWhich Operation You Want To Perform ?");
			System.out.println("Enter Your Choice:\n"
					+ "1. Add New Person \n2. Edit Person \n3. Delete Person "
					+ "\n4. Sort Entries By Name \n5. Sort Entries By Zip Code "
					+ "\n6. Exit Program \n7. Previous List");
			choice = Util.getInputInteger();
			switch(choice) {
			
			case 1 :
				addPerson(filename);
				break;
				
			case 2:
				editPerson(filename);
				break;
				
			case 3 :
				deletePerson(filename);
				break;
				
			case 4 :
				sortByName(filename);
				break;
				
			case 5 :
				sortByZipCode(filename);
				break;
				
			case 6 :
				quitProgram();
				break;
				
			case 7:
				return;	
				
			default :
				System.out.println("\nYou Entered Wrong Choice...!");
				}
			}while(choice > 0 && choice <= 7);
		return;
		}
		
	private static void addPerson(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		
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
		
		System.out.println("\nEnter State:");
		String state = Util.getInputString();
		address.setState(state);
		
		System.out.println("\nEnter Zip Code:");
		String zipcode = Util.getInputString();
		address.setZipCode(zipcode);
		
		System.out.println("\nEnter Phone No:");
		String phoneno = Util.getInputString();
		person.setPhoneno(phoneno);
		person.setAddress(address);
		list.add(person);
		save(filename);
	//	mapper.writeValue(new File(location+filename+".json"), list);
		System.out.println("\nData Added Successfully....");
		}
	
	private static void editPerson(String filename) throws JsonParseException, JsonMappingException, IOException {
		int choice;
		int decide;
		printEntries(filename);
		System.out.println("\nEnter Mobile No of The Person which you want to Edit details:");
		String mobileno = Util.getInputString();
		try {
			list = mapper.readValue(new File(location + filename + ".json"),
				new TypeReference<LinkedList<Person>>() {});
			
			if(list.size() == 0) {
				System.out.println("\nThere is No matching details To Edit");
			    return;
		        }
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getPhoneno().equals(mobileno)) {
				do {
					System.out.println("\nWhat you want to Edit?");
					System.out.println("\nEnter Your Choice: \n1. Address \n2. Phone No \n3. Previous");
					choice = Util.getInputInteger();
					
					switch(choice) {
					
					case 1:
						System.out.println("\nDecide In Address What you Want To Edit:"
								+ "\n1. City \n2. State \n3. Zip Code \n4. Full Address");
						decide = Util.getInputInteger();
						String city;
						String state;
						String zipcode;
						switch(decide) {
						
						
						case 1:
							System.out.println("\nEnter City:");
							city = Util.getInputString();
							address.setCity(city);
							list.get(i).setAddress(address);
						//	mapper.writeValue(new File(location+filename+".json"), list);
							save(filename);
							System.out.println("\nChange In City Name Updated Successfully.....");
							break;
							
						case 2:
							System.out.println("\nEnter State:");
							state = Util.getInputString();
							address.setState(state);
							list.get(i).setAddress(address);
							save(filename);
					//		mapper.writeValue(new File(location+filename+".json"), list);
							System.out.println("\nChange In State Name Updated Successfully.....");
							break;
							
						case 3:
							System.out.println("\nEnter Zip Code:");
							zipcode = Util.getInputString();
							address.setZipCode(zipcode);
							list.get(i).setAddress(address);
							save(filename);
				//			mapper.writeValue(new File(location+filename+".json"), list);
							System.out.println("\nChange In Zip Code Updated Successfully.....");
							break;
							
						case 4:
							System.out.println("\nEnter Address:");
							System.out.println("\nEnter City:");
							city = Util.getInputString();
							address.setCity(city);
							System.out.println("\nEnter State:");
							state = Util.getInputString();
							address.setState(state);
							System.out.println("\nEnter Zip Code:");
							zipcode = Util.getInputString();
							address.setZipCode(zipcode);
							list.get(i).setAddress(address);
							save(filename);
			//				mapper.writeValue(new File(location+filename+".json"), list);
							System.out.println("\nChange In Full Address Updated Successfully.....");
							break;
						}
						break;
						
					case 2:
						System.out.println("\nEnter Phone No:");
						String phoneno = Util.getInputString();
						list.get(i).setPhoneno(phoneno);
						save(filename);
				//		mapper.writeValue(new File(location+filename+".json"), list);
						System.out.println("\nChange In Phone No Updated Successfully.....");
						//printEntries(filename);
						break;
						
					case 3:
						return;
						}
					}while(choice > 0 && choice < 3);
				return;
				}
				}
			}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		}
	
	private static void sortByZipCode(String filename) throws JsonParseException, JsonMappingException, IOException {
		try {
			list = mapper.readValue(new File(location + filename + ".json"),
				new TypeReference<LinkedList<Person>>() {});
			Collections.sort(list,new SortZipCode());
			System.out.println("\n************** Address Book Data Sort By Zip Code *************");
			System.out.println("\nFirst Name \t Last Name \t Address \t\t Phone No");
			for(Person p : list) {
				System.out.println(p);
				}
			System.out.println("Sorted Successfully.....");
			}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		}

	private static void sortByName(String filename) {
		try {
			list = mapper.readValue(new File(location + filename + ".json"),
				new TypeReference<LinkedList<Person>>() {});
			Collections.sort(list,new SortName());
			System.out.println("\n************** Address Book Data Sort By Name *************");
			System.out.println("\nFirst Name \t Last Name \t Address \t\t Phone No");
			for(Person p : list) {
				System.out.println(p);
				}
			System.out.println("Sorted Successfully.....");
			}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		}
	
	private static void deletePerson(String filename) throws JsonParseException, JsonMappingException, IOException {
		
		System.out.println("\nEnter Mobile No of The Person which you want to Delete details:");
		String mobileno = Util.getInputString();
		
		try {
			list = mapper.readValue(new File(location + filename + ".json"),
					new TypeReference<LinkedList<Person>>() {});

			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getPhoneno().equals(mobileno)) {
					list.remove(i);
				//	save(filename);
					mapper.writeValue(new File(location + filename + ".json"),list);
					System.out.println("\nDetails Deleted Successfully....");
					printEntries(filename);
					return;
				}
			}
			System.out.println("No record found to delete !");
			
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public static void saveAs() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	private static void printEntries(String filename) throws JsonParseException, JsonMappingException, IOException {
		try {
			System.out.println("\n************** Address Book Data *************");
			list = mapper.readValue(new File(location + filename + ".json"), 
					new TypeReference<LinkedList<Person>>() {});
			
			System.out.println("\nFirst Name \t Last Name \t Address \t\t Phone No");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getFname() + "\t\t" + list.get(i).getLname() + "\t\t" +
			list.get(i).getAddress() + "\t" + list.get(i).getPhoneno());
			}
		}
		 catch (JsonParseException e) {
			 e.printStackTrace();
			 }
		catch (JsonMappingException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
				System.out.println("Address Book is empty.");
				}
		}

	public static void quitProgram() {
		System.exit(0);
		}

	public static void existing() throws JsonParseException, JsonMappingException, IOException {
		try {
			System.out.println("\nEnter File Name which You Want to Open:");
			String filename = Util.getInputString();
		existingOperations(filename);
		}
		catch (JsonParseException e) {
			e.printStackTrace();
		}
		catch (JsonMappingException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void save() throws JsonParseException, JsonMappingException, IOException {
		try {
			System.out.println("\nEnter File Name to Save the File with:");
			String filename = Util.getInputString();
			save(filename);
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
	}
		

private static void save(String filename) throws JsonParseException, JsonMappingException, IOException {
	try {
		list = mapper.readValue(new File(location + filename + ".json"),
				new TypeReference<LinkedList<Person>>() {});
		
		if(list.size() == 0) {
			mapper.writeValue(new File(location + filename + ".json"),person);
		}
		else {
			list.add(person);
			mapper.writeValue(new File(location + filename + ".json"),list);
		}
		}
	catch (JsonParseException e) {
		e.printStackTrace();
		}
	catch (JsonMappingException e) {
		e.printStackTrace();
		}
	catch (IOException e) {
		e.printStackTrace();
		}
	}
}


class SortZipCode implements Comparator<Person>{ 
	  public int compare(Person p1, Person p2) {
	        if((p1.getAddress().getZipCode()).compareTo(p2.getAddress().getZipCode()) > 0){
	            return 1;
	        } else {
	            return -1;
	        }
	        }
	  }

class SortName implements Comparator<Person>{ 
	  public int compare(Person p1, Person p2) {
	        if((p1.getFname()).compareTo(p2.getFname()) > 0){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
}

