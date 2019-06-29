package CommercialDataProcessing;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Util.Util;

public class CommercialDataProcessing {
	
	public static void main(String []args) throws JsonParseException, JsonMappingException, IOException {

		System.out.println("************ Commercial Data Procassing ************");
		int choice = 0;
		int amount;
		String symbol;
		try {
			do {
				System.out.println("\n****************** Main Menu ******************");
				System.out.println("\n\tWhat you Want To Do ?");
				System.out.println("\nEnter Your Choice:");
				System.out.println("\n1. Total Stock Value \n2. Buy Shares \n3. Sell Shares "
						+ "\n4. Save File \n5. Print Report \n6. Quit Program");
				choice = Util.getInputInteger();
				
				switch(choice) {
				
				case 1:
					double total = CommercialMethods.valueOf();
					System.out.println("\nTotal Available Stock :"+total );
					break;
				
				case 2:
					System.out.println("\n************* Available Company Shares **************\n");
					CommercialMethods.printReport();
					System.out.print("Enter the amount : ");
					amount = Util.getInputInteger();
					System.out.print("Enter the stock symbol : ");
					symbol = Util.getInputString();
					CommercialMethods.buyShares(amount, symbol);
					break;
					
				case 3:
					System.out.println("\n************* Available User Shares *************\n");
					CommercialMethods.uPrintReport();
					System.out.print("Enter the amount : ");
					amount = Util.getInputInteger();
					System.out.print("Enter the stock symbol : ");
					symbol = Util.getInputString();
					CommercialMethods.sellShares(amount, symbol);
					break;
					
				case 4:
					System.out.println("Enter File Name You Want To Save With:");
					String filename = Util.getInputString();
					CommercialMethods.save(filename);
					break;
					
				case 5:
					CommercialMethods.printReport();
					break;
					
				case 6:
					CommercialMethods.quit();
					break;
					
				default:
					System.out.println("Entered Invalid Data....!");
				}
				
			}while(choice > 0 && choice <= 5);
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
