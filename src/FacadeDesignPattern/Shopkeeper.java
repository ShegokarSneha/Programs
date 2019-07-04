package FacadeDesignPattern;

public class Shopkeeper {
	
	 private ElectronicsShop Mobile;  
	    private ElectronicsShop Television;  
	    private ElectronicsShop WashingMachine;  
	      
	    public Shopkeeper(){
	    	Mobile = new Mobile();  
	        Television = new Television();  
	        WashingMachine = new WashingMachine();
	        }  
	    
	    public void MobileInformation(){
	    	Mobile.productname();  
	    	Mobile.price();
	    	Mobile.features();
	        }
	    
	    public void TelevisionInformation(){
	    	Television.productname(); 
	    	Television.price();
	    	Television.features();
	        }  
	   
	    public void WashingMachineInformation(){
	    	WashingMachine.productname();
	    	WashingMachine.price();
	    	WashingMachine.features();
	        }  
	}
