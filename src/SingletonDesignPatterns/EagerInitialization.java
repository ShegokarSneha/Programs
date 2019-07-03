package SingletonDesignPatterns;

public class EagerInitialization {
	
	private EagerInitialization() {
		
	}
	
	private static EagerInitialization eagerInstance = new EagerInitialization();
	
	public static EagerInitialization getInstance() {
		return eagerInstance;
		
	}

}
