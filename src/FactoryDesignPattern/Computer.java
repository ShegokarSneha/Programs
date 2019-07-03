package FactoryDesignPattern;

public abstract class Computer {
	
	public abstract String getCPU();
	public abstract String getHDD();
	public abstract String getRAM();
	
	public String toString() {
		return "\n\t\tCPU = "+this.getCPU() + "\n\t\tHDD = " + this.getHDD() +"\n\t\tRAM = "+this.getRAM();
	}


}
