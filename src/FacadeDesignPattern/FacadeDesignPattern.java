package FacadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeDesignPattern {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice = 0;
		do{
			System.out.println("\n*********** Electronics Shop *************\n");
			System.out.print("========= Pruduct List ============ \n");  
	        System.out.print("1. Mobile. \n2. Television. \n3. Washing Machine. \n4. Exit.\n");  
	        System.out.print("\nEnter your choice: "); 
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());
	        Shopkeeper sk=new Shopkeeper();  
	              
	            switch (choice) {  
	            case 1:
	            	sk.MobileInformation();
	            	break;
	            	
	            case 2:  
	               sk.TelevisionInformation();
	               break;
	               
	            case 3:
	            	sk.WashingMachineInformation();
	                break;
	                
	            default:
	            	System.exit(0);
	            }	
	            
	      }while(choice!=4);
		}
}
