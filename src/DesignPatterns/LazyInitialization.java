package DesignPatterns;

public class LazyInitialization {
	
	private LazyInitialization() {
		
	}
	private static LazyInitialization lazyInstance;
	
	public static LazyInitialization getInstance() {
		if(lazyInstance == null) {
			return lazyInstance = new LazyInitialization();
		}
		else {
		return lazyInstance;
		}
	}

}
