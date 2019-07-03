package FactoryDesignPattern;

public class FactoryPattern {
	
	public static void main(String[] args) {
		System.out.println("\nFactory Design Pattern:");
		Computer pc = ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB","2.9 GHz");
		System.out.println("\nFactory PC Config :"+pc);
		System.out.println("\nFactory Server Config :"+server);
	}

}
