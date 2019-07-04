package FacadeDesignPattern;

public class WashingMachine implements ElectronicsShop{

	@Override
	public void price() {
		System.out.println("Price : 16,200");
		
	}

	@Override
	public void features() {
		System.out.println("Features :\n1. Size : 6.5 kg \n2. Fully Automatic \n3. Colour : Grey ");
		
	}

	@Override
	public void productname() {
		System.out.println("Washing Machine : Whirlpool");
		
	}

}
