package FactoryDesignPattern;

public class Server extends Computer {

	String hdd;
	String cpu;
	String ram;
	
	public Server(String RAM, String HDD, String CPU) {
		this.cpu = CPU;
		this.hdd = HDD;
		this.ram = RAM;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

}
