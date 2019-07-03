package AdapterDesignPattern;

public class AdapterPattern {

	public static void main(String[] args) {
		ClassAdapter();
		ObjectAdapter();
	}

	private static void ObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapter();
		Volt volt3 = getVolt(sockAdapter,3);
		Volt volt12 = getVolt(sockAdapter,12);
		Volt volt120 = getVolt(sockAdapter,120);
		
		System.out.println("\n========================================");
		System.out.println("Adapter Pattern Using Object Adapter");
		System.out.println("==========================================");
		System.out.println("3 volts using Object Adapter = " + volt3.getVolts());
		System.out.println("12 volts using Object Adapter = " + volt12.getVolts());
		System.out.println("120 volts using Object Adapter = " + volt120.getVolts());
	}

	private static void ClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapter();
		Volt volt3 = getVolt(sockAdapter,3);
		Volt volt12 = getVolt(sockAdapter,12);
		Volt volt120 = getVolt(sockAdapter,120);
		
		System.out.println("==========================================");
		System.out.println("Adapter Pattern Using Class Adapter");
		System.out.println("==========================================");
		System.out.println("3 volts using Class Adapter = " + volt3.getVolts());
		System.out.println("12 volts using Class Adapter = " + volt12.getVolts());
		System.out.println("120 volts using Class Adapter = " + volt120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		
		case 3: 
			return sockAdapter.getVolt3();
			
		case 12: 
			return sockAdapter.getVolt12();
			
		case 120: 
			return sockAdapter.getVolt120();
			
		default: 
			return sockAdapter.getVolt120();
		}
	}

	}


