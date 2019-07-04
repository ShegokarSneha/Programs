package FacadeDesignPattern;

public class Mobile implements ElectronicsShop {
	
	@Override
	public void price() {
		System.out.println("Price : 65000");
		
	}

	@Override
	public void productname() {
		System.out.println("Mobile : IPhone 6S");
		
	}

	@Override
	public void features() {
		System.out.println("Features : \n1. RAM : 4GB \n2. Colour : Gold \n3. Storage : 32 GB");
		
	}

}
