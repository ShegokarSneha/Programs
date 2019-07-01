package ClinicManagement;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Util.Util;

public class ClinicManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		System.out.println("\n******************* Clinic Management *******************\n");
		int choice = 0;
		do {
			System.out.println("****************** Main Menu *******************\n");
			System.out.println("What you want Do?\n");
			System.out.println("Enter Your Choice:\n1. Add Details \n2. Delete Details \n3. Fix Appointment "
					+ "\n4. Search Information \n5. Display Information \n6. Exit Program");
			choice = Util.getInputInteger();
			ClinicMethods operations = new ClinicMethods();
			
			switch(choice) {
			
			case 1:
				operations.addDetails();
				break;
				
			case 2:
				operations.deleteDetails();
				break;
				
			case 3:
				operations.fixAppointment();
				break;
				
			case 4:
				operations.searchInformation();
				break;
				
			case 5:
				operations.displayInformation();
				break;
				
			case 6:
				System.out.println("\nEixt Successfully....!");
				operations.quit();
				break;
				
			default:
				System.out.println("You Entered Wrong Choice...!");
			}
		}while(choice >= 1 && choice <= 5);

	}

}
