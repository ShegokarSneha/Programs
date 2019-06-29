package AddressBook;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Util.Util;

public class AddressBookManager {
	
	public static void main(String []args) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("\t**** Address Book Management ****");
		int choice = 0;
	
		System.out.println("\n****************** Main Menu ******************");
		do {
		System.out.println("\n\tWhat you Want To Do ?");
		System.out.println("\nEnter Your Choice:");
		System.out.println("\n1. Create New Address Book \n"
				+ "2. Open Existing Address Book \n"
				+ "3. Save Address Book \n"
				+ "4. Save Address Book As \n"
				+ "5. Quit Program");
		choice = Util.getInputInteger();
		
		switch(choice) {
		
		case 1:
			System.out.println("***** Creating New Address Book *****");
			AddressBookMethods.createNewAddressBook();
			break;
			
		case 2:
			System.out.println("***** Opening Existing Address Book *****");
			AddressBookMethods.existing();
			break;
			
		case 3:
			AddressBookMethods.save();
			System.out.println("Changes Saved Successfully");
			break;
			
		case 4:
			AddressBookMethods.saveAs();
			break;
			
		case 5:
			AddressBookMethods.quitProgram();
			break;
			
		default:
			System.out.println("You Entered Wrong Choice...!");
			}
		}while(choice>0 && choice <= 5);
		return;
	}

}
