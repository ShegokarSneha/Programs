package FacadeDesignPattern;

public class Television implements ElectronicsShop{

	@Override
	public void price() {
		System.out.println("Price : 12,999");
		
	}

	@Override
	public void features() {
		System.out.println("Feature : \n1. Size : 32 inches \n2. Colour : Black");
		
	}

	@Override
	public void productname() {
		System.out.println("Television : Mi LED TV");
		
	}

}
