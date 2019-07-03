package SingletonDesignPatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonPattern {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		System.out.println("=============================================================================");
		System.out.println("Eager Initialization Instance:");
		EagerInitialization eagerInstance = EagerInitialization.getInstance();
		System.out.println("\nHash Code of Eager Instance = "+eagerInstance.hashCode());
		
		EagerInitialization eagerInstance1 = EagerInitialization.getInstance();
		System.out.println("Hash Code of Eager Instance 1 = "+eagerInstance1.hashCode());
		System.out.println("\n=============================================================================");
		
		System.out.println("\nLazy InitialiZation Instance:");
		LazyInitialization lazyInstance = LazyInitialization.getInstance();
		System.out.println("\nHash Code of Lazy Instance = " + lazyInstance.hashCode());
		
		LazyInitialization lazyInstance1 = LazyInitialization.getInstance();
		System.out.println("Hash Code of Lazy Instance 1 = " + lazyInstance1.hashCode());
		System.out.println("\n=============================================================================");
		
		System.out.println("\nStatic Block Initialization Instance:");
		StaticBlockInitialization staticBlockInstance = StaticBlockInitialization.getInstance();
		System.out.println("\nHash Code of static Block Instance = " + staticBlockInstance.hashCode());
		
		StaticBlockInitialization staticBlockInstance1 = StaticBlockInitialization.getInstance();
		System.out.println("Hash Code of static Block Instance 1 = " + staticBlockInstance1.hashCode());
		System.out.println("\n=============================================================================");
		
		System.out.println("\nThread Safe Singleton Instance:");
		ThreadSafeSingleton threadSafeInstance = ThreadSafeSingleton.getInstance();
		System.out.println("\nHash Code of Thread Safe Instance = " + threadSafeInstance.hashCode());
		
		ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getInstance();
		System.out.println("Hash Code of Thread Safe Instance 1 = " + threadSafeInstance1.hashCode());
		System.out.println("=============================================================================");
		System.out.println("\nThread Safe Singleton Instance Using Double Checking:");
		ThreadSafeSingleton doubleCheckInstance = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println("\nHash Code of Thread Safe Instance = " + doubleCheckInstance.hashCode());
		
		ThreadSafeSingleton doubleCheckInstance1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println("Hash Code of Thread Safe Instance 1 using Double Checking = " + doubleCheckInstance1.hashCode());
		System.out.println("\n=============================================================================");
		System.out.println("\nEnum Singleton Instance:");
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		enumSingleton.i = 5;
		System.out.println("\nFirst Value = ");
		enumSingleton.show();
		
		enumSingleton.i= 6;
		System.out.println("\nSecond Value = ");
		enumSingleton.show();
		System.out.println("\n=============================================================================");
		System.out.println("\nBill Pugh Singleton Instance:");
		BillPughSingleton billpughInstance = BillPughSingleton.getInstance();
		System.out.println("\nHash Code of Bill Pugh Singleton Instance = " + billpughInstance.hashCode());
		
		BillPughSingleton billpughInstance1 = BillPughSingleton.getInstance();
		System.out.println("Hash Code of Bill Pugh Singleton Instance 1 = " + billpughInstance1.hashCode());
		System.out.println("\n=============================================================================");
		
		System.out.println("\nSerializable Singleton Instance:");
		SerializedSingleton serialinstance = SerializedSingleton.getInstance();
	    ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/home/admin1/eclipse-workspace/"
	    		+ "JSON File/correct.ser"));
	    out.writeObject(serialinstance);
	    out.close();
	    ObjectInput in = new ObjectInputStream(new FileInputStream("/home/admin1/eclipse-workspace/"
	    		+ "JSON File/correct.ser"));
	    SerializedSingleton serialinstance1 = (SerializedSingleton) in.readObject();
	    in.close();
	       
	    System.out.println("\nHash Code of Serializable Instance One = " + serialinstance.hashCode());
	    System.out.println("Hash Code of Serializable Instance Two = " + serialinstance1.hashCode());
	        
	}

}
