package DesignPatterns;

public class Singleton {

	public static void main(String[] args) {
		
		System.out.println("Eager Initialization:");
		EagerInitialization instance = EagerInitialization.getInstance();
		System.out.println("\nEager Instance : "+instance.hashCode());
		
		EagerInitialization instance1 = EagerInitialization.getInstance();
		System.out.println("\nEager Instance 1 : "+instance1.hashCode());
		
		System.out.println("\nLazy InitialiZation:");
		LazyInitialization lazyInstance = LazyInitialization.getInstance();
		System.out.println("\nLazy Instance : "+lazyInstance.hashCode());
		
		LazyInitialization lazyInstance1 = LazyInitialization.getInstance();
		System.out.println("\nLazy Instance 1: "+lazyInstance1.hashCode());
		
		System.out.println("\nStatic Block Initialization:");
		StaticBlockInitialization staticBlockInstance = StaticBlockInitialization.getInstance();
		System.out.println("\nstatic Block Instance : "+staticBlockInstance.hashCode());
		
		StaticBlockInitialization staticBlockInstance1 = StaticBlockInitialization.getInstance();
		System.out.println("\nstatic Block Instance 1: "+staticBlockInstance1.hashCode());

	}

}
