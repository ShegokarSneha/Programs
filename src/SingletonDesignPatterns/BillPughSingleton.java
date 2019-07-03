package SingletonDesignPatterns;

public class BillPughSingleton {
	
	private BillPughSingleton() {
		
	}
	
	public static class HelperClass{
		private static final BillPughSingleton billpughInstance  = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return HelperClass.billpughInstance;
	}

}
